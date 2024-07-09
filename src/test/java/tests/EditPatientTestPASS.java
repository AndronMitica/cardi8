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
 * Scenario: User successfully modifies patient data
 * Given the user is on the patients enrolled page
 * When the user clicks on the "Modify Patient Data" button
 * And selects a patient to modify
 * And updates the patient's information
 * And clicks on the save button
 * Then the patient's data should be updated and reflected on the patients enrolled page
 */
public class EditPatientTestPASS extends Hooks {

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

        LoggerUtility.infoTest("The user selects patient to modify");
        ManagementProfilePage managementProfilePage = new ManagementProfilePage(getWebDriver());
        managementProfilePage.clickModifyElementByName("Andron","Mitica");

        webTableObject.setNumeValue("New");
        webTableObject.setEmailValue("new.test@test.com");
        managementProfilePage.editEntry(webTableObject);
        managementProfilePage.submit();
        LoggerUtility.infoTest("The edit form is close successfully");
        LoggerUtility.infoTest("Patient data is updated and reflected on the enrolled patient management page");
    }
}