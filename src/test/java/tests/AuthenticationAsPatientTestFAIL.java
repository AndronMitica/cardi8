package tests;

import loggerUtility.LoggerUtility;
import objectData.LoginObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;

/**
 * Scenario: Unauthorized Access
 */
public class AuthenticationAsPatientTestFAIL extends Hooks {
    @Test
    public void testMethod() {
        String expectedErrorMessage = "Numele de utilizator sau parola sunt incorecte.";

        PropertyUtility propertyUtility = new PropertyUtility("invalidPatientCredentialsData");
        LoginObject loginObject = new LoginObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());

        homePage.navigateToAutentificareCaSiPacient();

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.insertCredentials(loginObject);

        LoggerUtility.infoTest("Error message: ");
        String errorMessage = loginPage.getLoginErrorMessage();

        Assert.assertTrue(errorMessage.equals(expectedErrorMessage),
                "Error message is not as expected.\nExpected: " + expectedErrorMessage + "\nActual: " + errorMessage);
    }
}
