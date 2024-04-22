package tests;

import objectData.LoginObject;
import objectData.WebTableObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.PacientiPage;
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
public class AddPatientFunctionalityShouldFailTest extends Hooks{

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

            PacientiPage pacientiPage = new PacientiPage(getWebDriver());
            pacientiPage.adaugarePacient();
            pacientiPage.addNewEntry(webTableObject);

            String errorMessage = loginPage.getLoginErrorMessage();
            Assert.assertEquals(errorMessage.equals(expectedErrorMessage),
                    "Error message is not expected.\nExpected: " + expectedErrorMessage + "\nActual: " + errorMessage);
        }
    }
