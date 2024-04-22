package tests;

import objectData.LoginObject;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;

/**
 * Scenario: User successfully logs in with valid credentials
 * Given the user is on the login page
 * When the user enters valid username and password
 * And clicks on the login button
 * Then the user should be redirected to the patients enrolled page
 */

public class LoginMedicShouldPassTest extends Hooks {

    @Test
    public void testMethod() {

        PropertyUtility propertyUtility = new PropertyUtility("loginWithValidCredentialsData");
        LoginObject loginObject = new LoginObject(propertyUtility.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAutentificareCaSiMedic();

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.insertCredentials(loginObject);
    }
}
