package tests;

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
public class LoginFunctionalityPatientShouldFailTest extends Hooks {
    @Test
    public void testMethod() {
        String expectedErrorMessage = "Numele de utilizator sau parola sunt incorecte.";

        PropertyUtility propertyUtility = new PropertyUtility("invalidPatientCredentialsData");
        LoginObject loginObject = new LoginObject(propertyUtility.getAllData());

        // Given the user navigates to the https://cardi8-web-app-design.vercel.app/
        HomePage homePage = new HomePage(getWebDriver());

        // And the user clicks on "Autentificare ca pacient" button
        homePage.navigateToAutentificareCaSiPacient();

        // And the user enters invalid username
        // And the user clicks on the login button
        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.insertCredentials(loginObject);

        // Then an error message should be displayed and the user should not be redirected to the care management profile page
        String errorMessage = loginPage.getLoginErrorMessage();
        Assert.assertEquals(errorMessage.equals(expectedErrorMessage),
                "Error message is not as expected.\nExpected: " + expectedErrorMessage + "\nActual: " + errorMessage);
    }
}
