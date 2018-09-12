package iOS;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

public class BaseTestIOS_Win {

    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected IOSDriver<IOSElement> driver = null;
    DesiredCapabilities dc = new DesiredCapabilities();
    public  String[] parametros;
    protected WebDriverWait wait;

    @Before
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "ede87006142f705eb52dab03c67ba224710bb16d");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.softrestaurant.softrestaurantappdistrib");
        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
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
}
