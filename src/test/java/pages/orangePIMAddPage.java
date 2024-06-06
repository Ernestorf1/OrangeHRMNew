package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class orangePIMAddPage extends BasePage {
    private String usernameF = "//input[@placeholder='Username']";
    private String passwordF = "//input[@placeholder='Password']";
    private String loginBtn = "//form[1]/div[3]/button[1]";
    private String pimBtn = "//ul[@class='oxd-main-menu']/li[2]/a";
    private String addBtn = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']";
    private String fNameField = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input";
    private String mNameField = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input";
    private String lNameField = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input";
    private String employeeIDField = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input";
    private String saveBtn = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']";
   private String nameRegistered = "//div[@class='orangehrm-edit-employee-name'][h6]";

    public orangePIMAddPage() {
        super(driver);
    }

    public void selectPIMOption() throws InterruptedException {
        navigateTo("https://opensource-demo.orangehrmlive.com");
        maximizeWindow();
        write(usernameF, "Admin", "xpath");
        write(passwordF, "admin123", "xpath");
        clickElement(loginBtn, "xpath");
        Thread.sleep(2000);
        clickElement(pimBtn, "xpath");

    }

    public void clicksOnAddBtn() {
        clickElement(addBtn, "xpath");
    }

    public void fillTheForm() {
        write(fNameField, "Ernix", "xpath");
        write(mNameField, "Buchananx", "xpath");
        write(lNameField, "Henessx", "xpath");
        write(employeeIDField, "01256", "xpath");
        clickElement(saveBtn, "xpath");

    }

    public void verifyRegisterSucces() throws InterruptedException {
       Thread.sleep(2000);
       // WebElement registeredNameElement = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/h6"));
        //String registeredNameString = registeredNameElement.getText();
        //Assert.assertEquals(registeredNameString, "Ernie Henessy");
   elementIsDisplayed(nameRegistered, "xpath");
    }

}
