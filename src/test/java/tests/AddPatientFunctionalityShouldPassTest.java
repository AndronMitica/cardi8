package tests;

import objectData.LoginObject;
import objectData.WebTableObject;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.PacientiPage;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;

/**
 * Scenario: User successfully adds a new patient
 * Given the user is on the patients enrolled page
 * When the user clicks on the "Add Patient" button
 * And fills out the patient form with valid information
 * And clicks on the submit button
 * Then the new patient should be added and displayed on the patients enrolled page
 */
public class AddPatientFunctionalityShouldPassTest extends Hooks {


    @Test
    public void testMethod() {

        PropertyUtility propertyUtility = new PropertyUtility("validMedicCredentialsData");
        LoginObject loginObject = new LoginObject(propertyUtility.getAllData());

        PropertyUtility propertyUtility1 = new PropertyUtility("validPatientData");
        WebTableObject webTableObject = new WebTableObject(propertyUtility1.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAutentificareCaSiMedic();

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.insertCredentials(loginObject);

        PacientiPage pacientiPage = new PacientiPage(getWebDriver());
        pacientiPage.adaugarePacient();
        pacientiPage.addNewEntry(webTableObject);

        // TBD
    }
}