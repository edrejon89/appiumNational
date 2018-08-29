package android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CP_1_CrearCuenta_Android {

    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("deviceName", "Android ");
        desiredCapabilities.setCapability("app", "C:\\Users\\rosi\\Documents\\TempNTS\\apks\\10.apk");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {
        try {
            Thread.sleep(6000);
            MobileElement el1 = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Open']"));
            el1.click();
            Thread.sleep(2000);
            (new TouchAction(driver)).tap(294, 471).perform();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement el2 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtName");
            el2.sendKeys("Walook Pruebas");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement el3 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtLastName");
            el3.sendKeys("Automation");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement el4 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtEmail");
            el4.sendKeys("walook.pruebas@gmail.com");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement el5 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtpassword");
            el5.sendKeys("Admin123");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement el6 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtconfirmpassword");
            el6.sendKeys("Admin123");
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement el7 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/btnAccount");
            el7.click();
            Thread.sleep(2000);
            MobileElement el8 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/btnSkip");
            el8.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement el9 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/lblSkip");
            el9.click();
            Thread.sleep(2000);
            MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("Open");
            el10.click();
            Thread.sleep(2000);
            (new TouchAction(driver)).tap(286, 1378).perform();
            Thread.sleep(2000);
            MobileElement el11 = (MobileElement) driver.findElementById("android:id/button1");
            Thread.sleep(2000);
            el11.click();
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
