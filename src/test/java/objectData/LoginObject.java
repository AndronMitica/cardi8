package objectData;

import java.util.Map;

public class LoginObject {
   private String usernameValue;
    private String passwordValue;
    public LoginObject(Map<String, String> testData) {
        prepareObject(testData);
    }
    private void prepareObject(Map<String, String> testdata) {

        for (String key : testdata.keySet()) {
            switch (key) {
                case "usernameValue":
                    setUsernameValue(testdata.get(key));
                    break;
                case "passwordValue":
                    setPasswordValue(testdata.get(key));
                    break;
            }
        }
    }
        public String getUsernameValue () {
            return usernameValue;
        }

        public void setUsernameValue (String usernameValue){
            this.usernameValue = usernameValue;
        }

        public String getPasswordValue () {
            return passwordValue;
        }

        public void setPasswordValue (String passwordValue){
            this.passwordValue = passwordValue;
        }
    }