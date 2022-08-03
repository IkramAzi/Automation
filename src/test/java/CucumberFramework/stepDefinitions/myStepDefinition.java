package CucumberFramework.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class myStepDefinition {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("user is on home page");

    }

    @When("^User Login into Application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        System.out.println("user login with user name and password ");

    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Home page populated");

    }
    @When("^User Login into Application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("Cards displayed are {string}")
    public void cards_are_displayed_are(String string) {

        System.out.println(string);
    }


}
