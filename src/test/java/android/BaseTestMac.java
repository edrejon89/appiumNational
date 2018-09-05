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
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BaseTestMac {

    public static AndroidDriver driver;
    protected WebDriverWait wait;
    protected String[] parametros;

    @Before
    public void setUp() throws IOException {
        parametros = leerCSV("src/test/java/configuracion/CapabilitiesMac");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", parametros[0]);
        desiredCapabilities.setCapability("platformVersion", parametros[1]);
        desiredCapabilities.setCapability("deviceName", parametros[2]);
        desiredCapabilities.setCapability("app", parametros[3]);
        desiredCapabilities.setCapability("automationName", parametros[4]);

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
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line = br.readLine();
        return line.split(",");
    }

    public void scrollAndClick(String visibleText) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
    }

}
