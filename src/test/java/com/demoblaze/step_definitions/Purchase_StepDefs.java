package com.demoblaze.step_definitions;

import com.demoblaze.pages.CartPage;
import com.demoblaze.pages.ProductPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Purchase_StepDefs {

    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @When("The user adds {string} from {string}")
    public void the_user_adds_from(String product, String category) {
        productPage.addProduct_mtd(product,category);
    }
    @When("The user removes {string} from cart")
    public void the_user_removes_from_cart(String removeProduct) {
        cartPage.removeProduct_mtd(removeProduct);
    }
    @When("The user places order and captures and log amount")
    public void the_user_places_order_and_captures_and_log_amount() {
        cartPage.finishPurchase_LogAmount_mtd();

    }
    @Then("The user verifies purchase amount equals {int}")
    public void the_user_verifies_purchase_amount_equals(Integer expectedAmount) {
        cartPage.verifyPurchaseAmount_mtd(expectedAmount);

    }

}
