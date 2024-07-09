package tests;

import loggerUtility.LoggerUtility;
import objectData.LoginObject;
import objectData.WebTableObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ManagementProfilePage;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;

/**
 * Scenario: User attempts to add a patient with invalid information
 * Given the user is on the patients enrolled page
 * When the user clicks on the "Add Patient" button
 * And fills out the patient form with invalid or incomplete information
 * And clicks on the submit button
 * Then appropriate validation errors should be displayed
 */
public class AddPatientTestFAIL extends Hooks{

        @Test
        public void testMethod() {
            String expectedErrorMessage = "Vă rog să introduceți CNP.";

            PropertyUtility propertyUtility = new PropertyUtility("validMedicCredentialsData");
            LoginObject loginObject = new LoginObject(propertyUtility.getAllData());

            PropertyUtility propertyUtility1 = new PropertyUtility("invalidPatientData");
            WebTableObject webTableObject = new WebTableObject(propertyUtility1.getAllData());

            HomePage homePage = new HomePage(getWebDriver());
            homePage.navigateToAutentificareCaSiMedic();

            LoginPage loginPage = new LoginPage(getWebDriver());
            loginPage.insertCredentials(loginObject);

            ManagementProfilePage managementProfilePage = new ManagementProfilePage(getWebDriver());
            managementProfilePage.adaugarePacient();
            managementProfilePage.addNewEntry(webTableObject);

            LoggerUtility.infoTest("The patient information are not saved in the system and the error message is displayed");
            String errorMessage = loginPage.getLoginErrorMessage();
            Assert.assertTrue(errorMessage.equals(expectedErrorMessage),
                    "Error message is not expected.\nExpected: " + expectedErrorMessage + "\nActual: " + errorMessage);
        }
    }