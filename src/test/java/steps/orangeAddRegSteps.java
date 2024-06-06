package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.orangeAddRegPage;


public class orangeAddRegSteps {
 orangeAddRegPage oAddReg = new orangeAddRegPage();

@ Given ("^user is on Dashboard$")
public void user_is_on_Dashboard(){
oAddReg.userIsOnDasboard();
}
@ When ("^user select admin option$")
public void user_select_admin_option(){
oAddReg.selAdminOpt();
}
@And ("^clicks on adding button$")
public void clicks_on_adding_button(){
oAddReg.clickAddBtn();
}
@And ("^fill out the form$")
public void fill_out_the_form(){
oAddReg.fillOutRegForm();
}
@Then ("^user is registered succesfully$")
public void user_is_registered_succesfully(){
oAddReg.regSucces();
}
    
}
