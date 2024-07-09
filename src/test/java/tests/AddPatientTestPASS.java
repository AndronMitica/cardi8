package tests;

import loggerUtility.LoggerUtility;
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
public class AddPatientTestPASS extends Hooks {


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

        ManagementProfilePage managementProfilePage = new ManagementProfilePage(getWebDriver());
        managementProfilePage.adaugarePacient();

        managementProfilePage.addNewEntry(webTableObject);

        LoggerUtility.infoTest("The adding form is closed successfully");
        LoggerUtility.infoTest("The new patient is added and showed on Home Page");
    }
}