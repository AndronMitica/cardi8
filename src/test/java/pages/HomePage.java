package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//a[@href='/login_medic']")
    private WebElement loginMedicField;

    @FindBy(xpath = "//a[@href='/login_pacient']")
    private WebElement loginPacientField;

    public void navidateToAutentificareCaSiMedic(){
        elementMethods.scrollElementByPixel(0,450);
        LoggerUtility.infoTest("The user scroll down the page");

        elementMethods.clickElement(loginMedicField);
        LoggerUtility.infoTest("The user clicks on the loginMedicField element");
    }
    public void navidateToAutentificareCaSiPacient(){
        elementMethods.scrollElementByPixel(0, 450);
        LoggerUtility.infoTest("The user scroll down the page");

        elementMethods.clickElement(loginPacientField);
        LoggerUtility.infoTest("The user clicks on the loginPacientField element");
    }


}
