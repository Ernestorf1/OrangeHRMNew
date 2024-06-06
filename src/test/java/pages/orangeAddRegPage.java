package pages;

public class orangeAddRegPage extends BasePage {
    private String usernameF = "//input[@placeholder='Username']";
    private String passwordF = "//input[@placeholder='Password']";
    private String loginBtn = "//form[1]/div[3]/button[1]";
    private String adminBtn = "//ul[@class='oxd-main-menu']/li[1]/a";
    private String adminTitle = "//h6[1]";
       private String addBtn = "//button[normalize-space()='Add']";
    private String selRole = "//i[@class='oxd-icon bi-caret-up-fill oxd-select-text--arrow']";
    private String role = "//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[1]";
    private String selStatus ="//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]";
    private String status = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']";
    private String employeeNameField ="//input[@placeholder='Type for hints...']";
    private String usernameField ="//input[@class='oxd-input oxd-input--focus']";
    private String passwordField ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input";
    private String confPassField ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input";
    private String password = "GodWithMe@";
   
    
    public orangeAddRegPage() {
        super(driver);
    }

    public void userIsOnDasboard() {
        navigateTo("https://opensource-demo.orangehrmlive.com");
        write(usernameF,"Admin", "xpath");
        write(passwordF, "admin123","xpath");
        clickElement(loginBtn, "xpath");     

    
    
    }

    public void selAdminOpt() {
        clickElement(adminBtn, "xpath");
        //elementIsDisplayed(adminTitle, "xpath");
    }

    public void clickAddBtn() {
        clickElement(addBtn, "xpath");
    }

    public void fillOutRegForm() {
        clickElement(selRole, "xpath");
        clickElement(role, "xpath");
        clickElement(selStatus, "xpath");
        //clickElement(adminBtn, addBtn);
        write(employeeNameField, "Ranga Akunuri", "xpath");
        write(usernameField, "ErnestoRF123", "xpath");
        write(passwordField, password, "xpath");
        write(confPassField, password, "xpath");
   
    }

    public void regSucces() {

    }
}
