package sharedData.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.time.Duration;
import java.util.Map;

public class SafariService implements BrowserService {

    private WebDriver webDriver;

    @Override
    public void openBrowser(Map<String, String> testData) {
        // This method aims to open a Safari browser with our configurations

        SafariOptions safariOptions = (SafariOptions) getBrowserOptions(testData);
        webDriver = new SafariDriver(safariOptions);
        webDriver.get(testData.get("url"));
        webDriver.manage().window().maximize();
        // Implicit wait
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Override
    public Object getBrowserOptions(Map<String, String> testData) {
        SafariOptions safariOptions = new SafariOptions();
            System.out.println("Safari used only for locat testing; doesn't support headless mode.");

        return safariOptions;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}