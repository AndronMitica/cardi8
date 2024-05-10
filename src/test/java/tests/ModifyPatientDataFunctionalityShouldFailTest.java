package tests;

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
 * Scenario: User attempts to modify patient data with invalid information
 * Given the user is on the patients enrolled page
 * When the user clicks on the "Modify Patient Data" button
 * And selects a patient to modify
 * And updates the patient's information with invalid data
 * And clicks on the save button
 * Then appropriate validation errors should be displayed
 */

public class ModifyPatientDataFunctionalityShouldFailTest extends Hooks {

    @Test
    public void testMethod() {

        String expectedErrorMessage = "Vă rog să introduceți adresa de email.";

        PropertyUtility propertyUtility = new PropertyUtility("validMedicCredentialsData");
        LoginObject loginObject = new LoginObject(propertyUtility.getAllData());

        PropertyUtility propertyUtility1 = new PropertyUtility("validPatientData");
        WebTableObject webTableObject = new WebTableObject(propertyUtility1.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navigateToAutentificareCaSiMedic();

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.insertCredentials(loginObject);

        ManagementProfilePage managementProfilePage = new ManagementProfilePage(getWebDriver());
        managementProfilePage.clickModifyButtonById("gy6Q9YiiRIXmJVvUfJaPEpSkYM92");

        webTableObject.setNumeValue("New");
        webTableObject.setEmailValue("email");
        managementProfilePage.editEntry(webTableObject);
        managementProfilePage.submit();

        String errorMessage = loginPage.getLoginErrorMessage();
        Assert.assertEquals(errorMessage.equals(expectedErrorMessage),
                "Error message is not expected.\nExpected: " + expectedErrorMessage + "\nActual: " + errorMessage);
    }

}