package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement addToCart_loc;


    public void addProduct_mtd(String product, String category){
        WebElement categoryModul = Driver.get().findElement(By.xpath("//a[.='" + category + "']"));
        BrowserUtils.waitForClickablility(categoryModul,3).click();

        WebElement productItem = Driver.get().findElement(By.xpath("//a[.='" + product + "']"));
        BrowserUtils.scrollToElement(productItem);
        BrowserUtils.waitForClickablility(productItem,3).click();

        BrowserUtils.waitFor(1);

        addToCart_loc.click();
        BrowserUtils.waitFor(1);
        Alert alert = Driver.get().switchTo().alert();
        alert.accept();
        homeLink_loc.click();
        BrowserUtils.waitFor(1);
    }
}
