package pages;

public class orangeLoginPage extends BasePage {
private String usernameF = "//input[@placeholder='Username']";
private String passwordF = "//input[@placeholder='Password']";
private String loginBtn = "//form[1]/div[3]/button[1]";

    public orangeLoginPage() {
		super(driver);
	}
    public void navigateToOrange() {
       navigateTo("https://opensource-demo.orangehrmlive.com");
    }

    public void usernameField() {
       write(usernameF,"Admin", "xpath");
              write(usernameF,"Admin", "xpath");
    }

    public void passwordField() {
        write(passwordF, "admin123","xpath");
    }

    public void submitLogin() {
       clickElement(loginBtn, "xpath");
      
    }
    
}
