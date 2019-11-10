package StepDef;

import Pages.CartPage;
import Pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class Stepdef2 {
    HomePage homepage = new HomePage ();
    CartPage cartPage =new CartPage ();
    @Given("^user will navigate to website$")
    public void user_will_navigate_to_website() throws Throwable {
        homepage.goToPage ();
    }

    @Then("^user will enter \"([^\"]*)\"$")
    public void user_will_enter_something(String strArg1) throws Throwable {
        homepage.enterWord (strArg1);
    }



    @Then("^user will navigate to cart$")
    public void user_will_navigate_to_cart() throws Throwable {
        homepage.gotToCart ();
    }

    @Then("^take a screenshot$")
    public void take_a_screenshot() throws Throwable {
       cartPage.takeScreenShot ();
    }

    @And("^user will click on the search bar$")
    public void user_will_click_on_the_search_bar() throws Throwable {
        homepage.clickSearchBox ();
    }

    @And("^user click search$")
    public void user_click_search() throws Throwable {
       homepage.clickSearchBox ();
    }

    @And("^user will add in to card$")
    public void user_will_add_in_to_card() throws Throwable {
       homepage.addToCard ();
    }



    @Then("{string} will be displayed")
    public void willBeDisplayed(String arg0) {
        homepage.isDisplayed (arg0);
    }

    @And("verify {string} in the cart")
    public void verifyInTheCart(String arg0) {
        cartPage.verify (arg0);
    }

    @And("user will add all list to the card")
    public void userWillAddAllListToTheCard() {
        homepage.AddListInTheCart ();
    }
}