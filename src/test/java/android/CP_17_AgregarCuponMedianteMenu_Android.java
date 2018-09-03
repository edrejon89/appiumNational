package android;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_17_AgregarCuponMedianteMenu_Android extends  BaseTestMac{

    @Test
    public  void Cp_17_AgregarCuponMedianteMenu_AndroidTest(){

        try {
            parametros = leerCSV("src/test/java/configuracion/CP17_Configuracion");
            Thread.sleep(8000);
            MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Open");
            Thread.sleep(2000);
            el1.click();
            MobileElement el2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]")));
            el2.click();
            MobileElement el3 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtEmail")));
            el3.sendKeys(parametros[0]);
            MobileElement el4 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtpassword")));
            el4.sendKeys(parametros[1]);
            MobileElement el5 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnlogin")));
            el5.click();
            Thread.sleep(8000);
            MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("Open");
            el6.click();
            MobileElement el7 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]")));
            el7.click();
            MobileElement el8 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button")));
            el8.click();
            driver.navigate().back();
            driver.navigate().back();
            driver.navigate().back();
            driver.navigate().back();
            MobileElement el9 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("Desplazarse hacia arriba")));
            el9.click();
            MobileElement el10 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button")));
            el10.click();
            MobileElement el11 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/titlePay")));
            el11.click();
            MobileElement el12 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            el12.click();
            MobileElement el13 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("Desplazarse hacia arriba")));
            el13.click();
            Thread.sleep(8000);
            MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("Open");
            el14.click();
            MobileElement el15 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]")));
            el15.click();
            MobileElement el16 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            el16.click();
            driver.navigate().back();
            driver.navigate().back();
            Thread.sleep(8000);
            MobileElement el17 = (MobileElement) driver.findElementByAccessibilityId("Open");
            el17.click();
            driver.navigate().back();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}
