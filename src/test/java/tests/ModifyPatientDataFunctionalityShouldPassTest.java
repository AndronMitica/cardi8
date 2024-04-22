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
 * Scenario: User successfully modifies patient data
 * Given the user is on the patients enrolled page
 * When the user clicks on the "Modify Patient Data" button
 * And selects a patient to modify
 * And updates the patient's information
 * And clicks on the save button
 * Then the patient's data should be updated and reflected on the patients enrolled page
 */
public class ModifyPatientDataFunctionalityShouldPassTest extends Hooks {

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
        pacientiPage.clickModifyButtonById("gy6Q9YiiRIXmJVvUfJaPEpSkYM92");

        webTableObject.setNumeValue("New");
        webTableObject.setEmailValue("new.test@test.com");
        pacientiPage.editEntry(webTableObject);
        pacientiPage.submit();

        //TBD
    }
}
