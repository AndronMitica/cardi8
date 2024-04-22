package pages;

import loggerUtility.LoggerUtility;
import objectData.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "normal_login_username")
    private WebElement userNameField;
    @FindBy(id = "normal_login_password")
    private WebElement passwordField;

    @FindBy(xpath = "//div[@class='back_button']//button[@type='submit']')")
    private WebElement backButton;

    @FindBy(xpath = "//div[@class='ant-form-item-control-input-content']//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class= 'ant-form-item-explain-error']")
    private WebElement errorMessage;

    public void insertCredentials(LoginObject loginObject) {
        elementMethods.clickElement(userNameField);
        LoggerUtility.infoTest("The user clicks on userNameField element");

        elementMethods.fillElement(userNameField,loginObject.getUsernameValue());
        LoggerUtility.infoTest("The user fills the userNameField");

        elementMethods.fillElement(passwordField, loginObject.getPasswordValue());
        LoggerUtility.infoTest("The user fills the passwordField");

        submitButton.click();
        LoggerUtility.infoTest("The user clicks on submitButton element");

    }

    public String getLoginErrorMessage() {
        elementMethods.printElementText(errorMessage);
        return errorMessage.getText();
    }

    public Boolean isUserNameFieldDisplayed() {
        return userNameField.isDisplayed();
    }
}