package tests;

import objectData.LoginObject;
import objectData.WebTableObject;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ManagementProfilePage;
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

        // Given the user navigates to the https://cardi8-web-app-design.vercel.app/
        HomePage homePage = new HomePage(getWebDriver());

        // And the user clicks on "Autentificare ca medic" button
        homePage.navigateToAutentificareCaSiMedic();

        // And the user enters valid password
        // And the user clicks on the login button
        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.insertCredentials(loginObject);

        ManagementProfilePage managementProfilePage = new ManagementProfilePage(getWebDriver());
        // When the user clicks on the "Add Patient" button
        managementProfilePage.adaugarePacient();

        // And fills out the patient form with valid information
        managementProfilePage.addNewEntry(webTableObject);

        // Then the new patient should be added and displayed on the patients enrolled page
    }
}