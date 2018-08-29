package android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class CP_1_CrearCuenta_Android extends BaseTest {

    @Test
    public void sampleTest() {
        try {
            parametros = leerCSV("src/test/java/configuracion/CP1_Configuracion");
            Thread.sleep(8000);
            MobileElement el1 = (MobileElement) driver.findElementById("Open");
            el1.click();
            Thread.sleep(2000);
            (new TouchAction(driver)).tap(294, 471).perform();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement el2 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtName");
            el2.sendKeys(parametros[0]);
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement el3 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtLastName");
            el3.sendKeys(parametros[1]);
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement el4 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtEmail");
            el4.sendKeys(parametros[2]);
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement el5 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtpassword");
            el5.sendKeys(parametros[3]);
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement el6 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtconfirmpassword");
            el6.sendKeys(parametros[3]);
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


}
