package tests;

import objectData.LoginObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;


/**
 * Scenario: User successfully logs in with valid credentials
 */

public class LoginFunctionalityMedicShouldPassTest extends Hooks {

    @Test
    public void testMethod() {

        PropertyUtility propertyUtility = new PropertyUtility("validMedicCredentialsData");
        LoginObject loginObject = new LoginObject(propertyUtility.getAllData());

        // Given the user navigates to the https://cardi8-web-app-design.vercel.app/
        HomePage homePage = new HomePage(getWebDriver());

        // And the user clicks on "Autentificare ca medic" button
        homePage.navigateToAutentificareCaSiMedic();

        // And the user enters valid username & password
        // And the user clicks on the login button
        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.insertCredentials(loginObject);

        // Then the user should be redirected to the care management patient profile page
        Assert.assertTrue(loginPage.isUserNameFieldDisplayed(), "User name field is not displayed after successful login.");
    }
}
