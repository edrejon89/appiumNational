package android;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_5_IniciarSesion_Android extends BaseTestMac{

    @Test
    public void CP5IniciarSesionAndroidTest(){

        try {
            parametros = leerCSV("src/test/java/configuracion/CP5_Configuracion");
            Thread.sleep(8000);
            MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Open");
            el2.click();
            MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView");
            el3.click();
            MobileElement el4 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtEmail")));
            el4.click();
            el4.sendKeys("erejon@walook.com.mx");
            MobileElement el5 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtpassword");
            el5.click();
            el5.sendKeys("Rejon150");
            MobileElement el6 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnlogin")));
            el6.click();
            Thread.sleep(8000);
            MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Open");
            el7.click();
            MobileElement el8 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]/android.widget.CheckedTextView")));
            el8.click();
            MobileElement el9 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            el9.click();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }

}
