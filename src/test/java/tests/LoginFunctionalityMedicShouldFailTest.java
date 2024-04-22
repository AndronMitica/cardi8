package tests;

import objectData.LoginObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;

/**
 * Scenario: User provides invalid credentials
 * Given the user is on the login page
 * When the user enters invalid username or password
 * And clicks on the login button
 * Then an error message should be displayed
 */
public class LoginFunctionalityMedicShouldFailTest extends Hooks {

    @Test
    public void testMethod() {
        String expectedErrorMessage = "Numele de utilizator sau parola sunt incorecte.";

        PropertyUtility propertyUtility = new PropertyUtility("invalidMedicCredentialsData");
        LoginObject loginObject = new LoginObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAutentificareCaSiMedic();

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.insertCredentials(loginObject);

        String errorMessage = loginPage.getLoginErrorMessage();
        Assert.assertEquals(errorMessage.equals(expectedErrorMessage),
        "Error message is not expected.\nExpected: " + expectedErrorMessage + "\nActual: " + errorMessage);
    }
}
