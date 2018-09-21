package android;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_27_HistorialPedidos_Android extends BaseTest{
    @Test
    public void CP_27_HistorialPedidos_AndroidTest(){

        try {

            parametros = leerCSV("src/test/java/configuracion/CP27_Configuracion");
            Thread.sleep(10000);
            MobileElement btnOpen = (MobileElement) driver.findElementByAccessibilityId("Open");
            Thread.sleep(2000);
            btnOpen.click();
            MobileElement btnIniciarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]")));
            btnIniciarSesion.click();
            MobileElement txtEmail = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtEmail")));
            txtEmail.clear();
            txtEmail.sendKeys(parametros[0]);
            MobileElement txtpassword = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtpassword")));
            txtpassword.sendKeys(parametros[1]);
            MobileElement btnlogin = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnlogin")));
            btnlogin.click();
            Thread.sleep(30000);
            btnOpen = (MobileElement) driver.findElementByAccessibilityId("Open");
            Thread.sleep(2000);
            btnOpen.click();
            MobileElement btnPedidos = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[3]")));
            btnPedidos.click();
            Thread.sleep(8000);
            MobileElement btnArriba = (MobileElement) driver.findElementByAccessibilityId("Navegar hacia arriba");
            btnArriba.click();
            Thread.sleep(8000);
            btnOpen = (MobileElement) driver.findElementByAccessibilityId("Open");
            Thread.sleep(2000);
            btnOpen.click();
            MobileElement btnCerrarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]")));
            btnCerrarSesion.click();
            MobileElement btnOkSi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            btnOkSi.click();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }
}
