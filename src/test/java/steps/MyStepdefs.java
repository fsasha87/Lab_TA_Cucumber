package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.businessobject.SearchResultsPageBO;
import pages.businessobject.Verifier;
import utils.PropertiesReader;
import utils.WebDriverSingleton;

public class MyStepdefs {
    SearchResultsPageBO searchResultsPageBO = new SearchResultsPageBO();

    @Given("I go to rozetka page")
    public void iGoToRozetkaPage() {
        WebDriverSingleton.getDriver().get(PropertiesReader.getUrl());
    }

    @When("I type category {string}")
    public void iTypeCategory(String category) {
        searchResultsPageBO.typeCategory(category);
    }

    @And("I select brand {string}")
    public void iSelectBrand(String brand) {
        searchResultsPageBO.selectGoodByBrand(brand);
    }

    @And("I throw to bucket the cheapest")
    public void iThrowToBucketTheCheapest() {
        searchResultsPageBO.throwTheCheapestToTheBucket();
    }

    @Then("I check if I have enough money {string}")
    public void iCheckIfIHaveEnoughMoney(String amount) {
        new Verifier()
                .verifyAmountWithSoftAssert(amount)
                .verifyAmount(amount);
    }

    @After
    public void tearDown() {
        WebDriverSingleton.close();
    }

}
