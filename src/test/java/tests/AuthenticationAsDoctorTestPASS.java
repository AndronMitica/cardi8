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
 * Scenario: User successfully logs in with valid credentials
 */

public class AuthenticationAsDoctorTestPASS extends Hooks {

    @Test
    public void testMethod() {

        PropertyUtility propertyUtility = new PropertyUtility("validMedicCredentialsData");
        LoginObject loginObject = new LoginObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());

        homePage.navigateToAutentificareCaSiMedic();

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.insertCredentials(loginObject);

        Assert.assertTrue(loginPage.isUserNameFieldDisplayed(), "User name field is not displayed after successful login");
        LoggerUtility.infoTest("Authenticated successfully");
    }
}
