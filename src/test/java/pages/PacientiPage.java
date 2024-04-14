package pages;

import loggerUtility.LoggerUtility;
import objectData.WebTableObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PacientiPage extends BasePage {

    public PacientiPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = "//button[@type='button' and contains(@class, 'ant-btn-primary')]")
    private WebElement adaugaPacientButton;
    @FindBy(id = "nume")
    private WebElement numeField;
    @FindBy(id = "prenume")
    private WebElement prenumeField;
    @FindBy(id = "varsta")
    private WebElement varstaField;
    @FindBy(id = "CNP")
    private WebElement cnpField;
    @FindBy(id = "strada")
    private WebElement stradaField;
    @FindBy(id = "numar")
    private WebElement numarField;
    @FindBy(id = "bloc")
    private WebElement blocField;
    @FindBy(id = "etaj")
    private WebElement etajField;
    @FindBy(id = "apartament")
    private WebElement apartamentField;
    @FindBy(id = "oras")
    private WebElement orasField;
    @FindBy(id = "judet")
    private WebElement judetField;
    @FindBy(id = "codPostal")
    private WebElement codPostalField;
    @FindBy(id = "telefon")
    private WebElement telefonField;
    @FindBy(id = "email")
    private WebElement emailField;
    @FindBy(id = "profesie")
    private WebElement profesieField;
    @FindBy(id = "locDeMunca")
    private WebElement locDeMuncaField;
    @FindBy(id = "istoric")
    private WebElement istoricField;
    @FindBy(id = "alergii")
    private WebElement alergiiField;
    @FindBy(id = "consultatii")
    private WebElement consultatiiField;
    //    @FindBy(xpath = "(//div[@class='ant-form-item css-1vd04s3']//button[@type='submit'])[2]")
    @FindBy(xpath = "//button[@type='submit' and span[contains(text(), 'Salvează')]]")
    private WebElement salveazaButton;



    public void adaugarePacient() {
        elementMethods.clickElement(adaugaPacientButton);
        LoggerUtility.infoTest("The user clicks on adaugaPacientButton");
    }

    public void addNewEntry(WebTableObject webTableObject) {
        elementMethods.clickElement(numeField);

        elementMethods.fillElement(numeField, webTableObject.getNumeValue());
        LoggerUtility.infoTest("The user add nume value");

        elementMethods.fillElement(prenumeField, webTableObject.getPrenumeValue());
        LoggerUtility.infoTest("The user add prenume value");

        elementMethods.fillElement(varstaField, webTableObject.getVarstaValue());
        LoggerUtility.infoTest("The user add varsta value");

        elementMethods.fillElement(cnpField, webTableObject.getCnpValue());
        LoggerUtility.infoTest("The user add cnp value");

        elementMethods.scrollElementByPixel(0, 350);
        LoggerUtility.infoTest("The user scroll down the page");

        elementMethods.fillElement(stradaField, webTableObject.getStradaValue());
        LoggerUtility.infoTest("The user add strada value");

        elementMethods.fillElement(numarField, webTableObject.getNumarValue());
        LoggerUtility.infoTest("The user add numar value");

        elementMethods.fillElement(blocField, webTableObject.getBlocValue());
        LoggerUtility.infoTest("The user add bloc value");

        elementMethods.fillElement(etajField, webTableObject.getEtajValue());
        LoggerUtility.infoTest("The user add etaj value");

        elementMethods.fillElement(apartamentField, webTableObject.getApartamentValue());
        LoggerUtility.infoTest("The user add apartament value");

        elementMethods.fillElement(orasField, webTableObject.getOrasValue());
        LoggerUtility.infoTest("The user add oras value");

        elementMethods.fillElement(judetField, webTableObject.getJudetValue());
        LoggerUtility.infoTest("The user add judet value");

        elementMethods.fillElement(codPostalField, webTableObject.getCodPostalValue());
        LoggerUtility.infoTest("The user add codPostal value");

        elementMethods.fillElement(telefonField, webTableObject.getTelefonValue());
        LoggerUtility.infoTest("The user add telefon value");

        elementMethods.fillElement(emailField, webTableObject.getEmailValue());
        LoggerUtility.infoTest("The user add email value");

        elementMethods.fillElement(profesieField, webTableObject.getProfesieValue());
        LoggerUtility.infoTest("The user add profesie value");

        elementMethods.fillElement(locDeMuncaField, webTableObject.getLocDeMuncaValue());
        LoggerUtility.infoTest("The user add locDeMunca value");

        elementMethods.scrollElementByPixel(0, 450);
        LoggerUtility.infoTest("The user scroll down the page");

        elementMethods.fillElement(istoricField, webTableObject.getIstoricValue());
        LoggerUtility.infoTest("The user add istoric value");

        elementMethods.fillElement(alergiiField, webTableObject.getAlergiiValue());
        LoggerUtility.infoTest("The user add alergii value");

        elementMethods.fillElement(consultatiiField, webTableObject.getConsultatiiValue());
        LoggerUtility.infoTest("The user add consultatii value");

        webDriver.switchTo().activeElement().sendKeys(Keys.TAB);

        elementMethods.clickElement(salveazaButton);
        LoggerUtility.infoTest("The user clicks on salveazaButton");

    }
}
