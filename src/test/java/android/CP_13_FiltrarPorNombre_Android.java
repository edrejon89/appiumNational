package android;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_13_FiltrarPorNombre_Android extends  BaseTestMac {


    @Test
    public void CP_13_FiltrarPorNombre_AndroidTest() {

        try {
            MobileElement el3 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnSearchDirectory")));
            el3.click();
            MobileElement el4 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/search_src_text")));
            el4.sendKeys("Walook");
            Thread.sleep(2000);
            el4.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
            driver.navigate().back();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }





}
