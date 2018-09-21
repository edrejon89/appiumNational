package android;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class BaseTest {

    public static AndroidDriver driver;
    public  String[] parametros;
    protected WebDriverWait wait;

    @Before
    public void setUp() throws IOException {

        String[] capabilities = leerCSV("src/test/java/configuracion/Capabilities");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", capabilities[0]);
        desiredCapabilities.setCapability("platformVersion", capabilities[1]);
        desiredCapabilities.setCapability("deviceName", capabilities[2]);
        desiredCapabilities.setCapability("app", capabilities[3]);
        desiredCapabilities.setCapability("automationName", capabilities[4]);
        desiredCapabilities.setCapability("newCommandTimeout", 120);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        wait = new WebDriverWait(driver,60 );
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public String[] leerCSV(String path) throws IOException {
        File f = new File(path);
        BufferedReader br =new BufferedReader(new FileReader(f));
        String line = br.readLine();
        return line.split(",");
    }

    public void scrollAndClick(String visibleText) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
    }
}
