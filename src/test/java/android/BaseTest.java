package android;

import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class BaseTest {

    public static AndroidDriver driver;
    public  String[] parametros;

    @Before
    public void setUp() throws IOException {

        String[] capabilities = leerCSV("src/test/java/configuracion/Capabilities");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", capabilities[0]);
        desiredCapabilities.setCapability("platformVersion", capabilities[1]);
        desiredCapabilities.setCapability("deviceName", capabilities[2]);
        desiredCapabilities.setCapability("app", capabilities[3]);
        desiredCapabilities.setCapability("automationName", capabilities[4]);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
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
}
