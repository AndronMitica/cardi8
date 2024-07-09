package pages;

import loggerUtility.LoggerUtility;
import objectData.WebTableObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ManagementProfilePage extends BasePage {

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

    @FindBy(xpath = "//button[contains(@class, 'salvare_pacient')]/span")
    private WebElement salveazaButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/form/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[1]/div")
    public WebElement errorMessage;

    @FindBy(xpath = "//button[contains(@class, 'ant-btn') and contains(@class, 'css-1vd04s3') and contains(@class, 'ant-btn-round') and contains(@class, 'ant-btn-default') and contains(@class, 'action_button') and .//span[@aria-label='edit']]")
    public List<WebElement> modifyButtonFields;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div/div/div/div/table/tbody/tr/td[1]")
    private List<WebElement> nameValues;

    public ManagementProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void adaugarePacient() {
        elementMethods.clickElement(adaugaPacientButton);
        LoggerUtility.infoTest("The user clicks on adaugaPacientButton");
    }

    public void addNewEntry(WebTableObject webTableObject) {
        elementMethods.clickElement(numeField);

        elementMethods.fillElement(numeField, webTableObject.getNumeValue());
        LoggerUtility.infoTest("The user adds nume value");

        elementMethods.fillElement(prenumeField, webTableObject.getPrenumeValue());
        LoggerUtility.infoTest("The user adds prenume value");

        elementMethods.fillElement(varstaField, webTableObject.getVarstaValue());
        LoggerUtility.infoTest("The user adds varsta value");

        elementMethods.fillElement(cnpField, webTableObject.getCnpValue());
        LoggerUtility.infoTest("The user adds cnp value");

        elementMethods.scrollElementByPixel(0, 350);
        LoggerUtility.infoTest("The user scrolls down the page");

        elementMethods.fillElement(stradaField, webTableObject.getStradaValue());
        LoggerUtility.infoTest("The user adds strada value");

        elementMethods.fillElement(numarField, webTableObject.getNumarValue());
        LoggerUtility.infoTest("The user adds numar value");

        elementMethods.fillElement(blocField, webTableObject.getBlocValue());
        LoggerUtility.infoTest("The user adds bloc value");

        elementMethods.fillElement(etajField, webTableObject.getEtajValue());
        LoggerUtility.infoTest("The user adds etaj value");

        elementMethods.fillElement(apartamentField, webTableObject.getApartamentValue());
        LoggerUtility.infoTest("The user adds apartament value");

        elementMethods.fillElement(orasField, webTableObject.getOrasValue());
        LoggerUtility.infoTest("The user adds oras value");

        elementMethods.fillElement(judetField, webTableObject.getJudetValue());
        LoggerUtility.infoTest("The user adds judet value");

        elementMethods.fillElement(codPostalField, webTableObject.getCodPostalValue());
        LoggerUtility.infoTest("The user adds codPostal value");

        elementMethods.fillElement(telefonField, webTableObject.getTelefonValue());
        LoggerUtility.infoTest("The user adds telefon value");

        elementMethods.fillElement(emailField, webTableObject.getEmailValue());
        LoggerUtility.infoTest("The user adds email value");

        elementMethods.fillElement(profesieField, webTableObject.getProfesieValue());
        LoggerUtility.infoTest("The user adds profesie value");

        elementMethods.fillElement(locDeMuncaField, webTableObject.getLocDeMuncaValue());
        LoggerUtility.infoTest("The user adds locDeMunca value");

        elementMethods.scrollElementByPixel(0, 850);
        LoggerUtility.infoTest("The user scrolls down the page");

        elementMethods.fillElement(istoricField, webTableObject.getIstoricValue());
        LoggerUtility.infoTest("The user adds istoric value");

        elementMethods.fillElement(alergiiField, webTableObject.getAlergiiValue());
        LoggerUtility.infoTest("The user adds alergii value");

        elementMethods.fillElement(consultatiiField, webTableObject.getConsultatiiValue());
        LoggerUtility.infoTest("The user adds consultatii value");

        salveazaButton.click();
        LoggerUtility.infoTest("The user fills the form with valid information");
        LoggerUtility.infoTest("The user clicks on salveazaButton");
    }


    public String getDataFillErrorMessage() {
        elementMethods.printElementText(errorMessage);
        return errorMessage.getText();
    }

    public void clickModifyElementByName(String numeValue, String prenumeValue) {
        elementMethods.scrollElementByPixel(0, 450);

        for (int i = 1; i < nameValues.size(); i++) {
            // Extrage textul din elementul de nume la indexul i
            String fullName = nameValues.get(i).getText();

            // Verifică dacă numele complet se potrivește cu numele și prenumele specificate
            if (fullName.equals(numeValue + " " + prenumeValue)) {
                // Faceți clic pe butonul de modificare corespunzător
                modifyButtonFields.get(i).click();
                LoggerUtility.infoTest("The user clicked on modify button for " + fullName);
                break; // Ieșiți din buclă după ce ați găsit corespondența
            }
        }
    }
    public void editEntry(WebTableObject webTableObject) {

        elementMethods.refillElement(numeField, webTableObject.getNumeValue());
        LoggerUtility.infoTest("The user edits nume value");

        elementMethods.refillElement(orasField, webTableObject.getOrasValue());
        LoggerUtility.infoTest("The user edits email value");

        LoggerUtility.infoTest("The user modifies patient information");

        elementMethods.clickElement(salveazaButton);
        LoggerUtility.infoTest("The user click on salveazaButton");
    }

    public void submit() {
        salveazaButton.click();
    }
}