package objectData;

import java.util.Map;

public class WebTableObject {
    private String numeValue;
    private String prenumeValue;
    private String varstaValue;
    private String cnpValue;
    private String stradaValue;
    private String numarValue;
    private String blocValue;
    private String etajValue;
    private String apartamentValue;
    private String orasValue;
    private String judetValue;
    private String codPostalValue;

    private String telefonValue;
    private String emailValue;
    private String profesieValue;
    private String locDeMuncaValue;
    private String istoricValue;
    private String alergiiValue;
    private String consultatiiValue;

    public WebTableObject(Map<String, String> testData) {
        prepareObject(testData);
    }


    private void prepareObject(Map<String, String> testdata) {

        for (String key : testdata.keySet()) {
            switch (key) {
                case "numeValue":
                    setNumeValue(testdata.get(key));
                    break;
                case "prenumeValue":
                    setPrenumeValue(testdata.get(key));
                    break;
                case "varstaValue":
                    setVarstaValue(testdata.get(key));
                    break;
                case "cnpValue":
                    setCnpValue(testdata.get(key));
                    break;
                case "stradaValue":
                    setStradaValue(testdata.get(key));
                    break;
                case "numarValue":
                    setNumarValue(testdata.get(key));
                    break;
                case "blocValue":
                    setBlocValue(testdata.get(key));
                    break;
                case "etajValue":
                    setEtajValue(testdata.get(key));
                    break;
                case "apartamentValue":
                    setApartamentValue(testdata.get(key));
                    break;
                case "orasValue":
                    setOrasValue(testdata.get(key));
                    break;
                case "judetValue":
                    setJudetValue(testdata.get(key));
                    break;
                case "codPostalValue":
                    setCodPostalValue(testdata.get(key));
                    break;
                case "telefonValue":
                    setTelefonValue(testdata.get(key));
                    break;
                case "emailValue":
                    setEmailValue(testdata.get(key));
                    break;
                case "profesieValue":
                    setProfesieValue(testdata.get(key));
                    break;
                case "locDeMuncaValue":
                    setLocDeMuncaValue(testdata.get(key));
                    break;
                case "istoricValue":
                    setIstoricValue(testdata.get(key));
                    break;
                case "alergiiValue":
                    setAlergiiValue(testdata.get(key));
                    break;
                case "consultatiiValue":
                    setConsultatiiValue(testdata.get(key));
                    break;
            }
        }
    }

    public String getNumeValue() {
        return numeValue;
    }

    public void setNumeValue(String numeValue) {
        this.numeValue = numeValue;
    }

    public String getPrenumeValue() {
        return prenumeValue;
    }

    public void setPrenumeValue(String prenumeValue) {
        this.prenumeValue = prenumeValue;
    }

    public String getVarstaValue() {
        return varstaValue;
    }

    public void setVarstaValue(String varstaValue) {
        this.varstaValue = varstaValue;
    }

    public String getCnpValue() {
        return cnpValue;
    }

    public void setCnpValue(String cnpValue) {
        this.cnpValue = cnpValue;
    }

    public String getStradaValue() {
        return stradaValue;
    }

    public void setStradaValue(String stradaValue) {
        this.stradaValue = stradaValue;
    }

    public String getNumarValue() {
        return numarValue;
    }

    public void setNumarValue(String numarValue) {
        this.numarValue = numarValue;
    }

    public String getBlocValue() {
        return blocValue;
    }

    public void setBlocValue(String blocValue) {
        this.blocValue = blocValue;
    }

    public String getEtajValue() {
        return etajValue;
    }

    public void setEtajValue(String etajValue) {
        this.etajValue = etajValue;
    }

    public String getApartamentValue() {
        return apartamentValue;
    }

    public void setApartamentValue(String apartamentValue) {
        this.apartamentValue = apartamentValue;
    }

    public String getOrasValue() {
        return orasValue;
    }

    public void setOrasValue(String orasValue) {
        this.orasValue = orasValue;
    }

    public String getJudetValue() {
        return judetValue;
    }

    public void setJudetValue(String judetValue) {
        this.judetValue = judetValue;
    }

    public String getCodPostalValue() {
        return codPostalValue;
    }

    public void setCodPostalValue(String codPostalValue) {
        this.codPostalValue = codPostalValue;
    }

    public String getTelefonValue() {
        return telefonValue;
    }

    public void setTelefonValue(String telefonValue) {
        this.telefonValue = telefonValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public String getProfesieValue() {
        return profesieValue;
    }

    public void setProfesieValue(String profesieValue) {
        this.profesieValue = profesieValue;
    }

    public String getLocDeMuncaValue() {
        return locDeMuncaValue;
    }

    public void setLocDeMuncaValue(String locDeMuncaValue) {
        this.locDeMuncaValue = locDeMuncaValue;
    }

    public String getIstoricValue() {
        return istoricValue;
    }

    public void setIstoricValue(String istoricValue) {
        this.istoricValue = istoricValue;
    }

    public String getAlergiiValue() {
        return alergiiValue;
    }

    public void setAlergiiValue(String alergiiValue) {
        this.alergiiValue = alergiiValue;
    }

    public String getConsultatiiValue() {
        return consultatiiValue;
    }

    public void setConsultatiiValue(String consultatiiValue) {
        this.consultatiiValue = consultatiiValue;
    }
}
