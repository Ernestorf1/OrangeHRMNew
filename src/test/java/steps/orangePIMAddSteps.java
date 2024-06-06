package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.orangePIMAddPage;

public class orangePIMAddSteps {

    orangePIMAddPage orangePIMAP = new orangePIMAddPage();

    @Given("^user select PIM option$")
public void user_select_pim_option() throws InterruptedException {
orangePIMAP.selectPIMOption();
}
@When("^clicks on add button$")
public void clicks_on_add_button() {
orangePIMAP.clicksOnAddBtn();
}

@And("^fill out the form with login details$")
public void fill_out_the_form_with_login_details() {
orangePIMAP.fillTheForm();
}

@Then("^user verify employee is registered$")
public void user_verify_employee_is_registered() throws InterruptedException {
orangePIMAP.verifyRegisterSucces();
}

    
}
