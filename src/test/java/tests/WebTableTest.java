package tests;

import objectData.LoginObject;
import objectData.WebTableObject;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.PacientiPage;
import propertyUtility.PropertyUtility;
import sharedData.Hooks;

public class WebTableTest extends Hooks {

    @Test
    public void testMethod() {

        PropertyUtility propertyUtility = new PropertyUtility("loginData");
        LoginObject loginObject = new LoginObject(propertyUtility.getAllData());

        PropertyUtility propertyUtility1 = new PropertyUtility("webTableData");
        WebTableObject webTableObject = new WebTableObject(propertyUtility1.getAllData());

        HomePage homePage = new HomePage(getWebDriver());
        homePage.navidateToAutentificareCaSiMedic();

        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage.insertCredentials(loginObject);

        PacientiPage pacientiPage = new PacientiPage(getWebDriver());
        pacientiPage.adaugarePacient();
        pacientiPage.addNewEntry(webTableObject);

    }
}