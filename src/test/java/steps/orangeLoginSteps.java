package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.orangeLoginPage;

public class orangeLoginSteps {
    orangeLoginPage oLPage = new orangeLoginPage();
  

    @Given("user is on the login page")
public void user_is_on_the_login_page() {
   oLPage.navigateToOrange();
}
@When("user logs in with user and password")
public void user_logs_in_with_user_and_password() {
  oLPage.usernameField();
  oLPage.passwordField();
  oLPage.submitLogin();
}
@Then("user is succesfully logged in")
public void user_is_succesfully_logged_in() {

}

}
