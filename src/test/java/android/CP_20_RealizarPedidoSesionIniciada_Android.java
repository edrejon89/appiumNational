package android;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_20_RealizarPedidoSesionIniciada_Android extends BaseTestMac {
    public void CP_20_RealizarPedidoSesionIniciada_AndroidTest(){
        try {
            parametros = leerCSV("src/test/java/configuracion/CP20_Configuracion");
            Thread.sleep(8000);
            MobileElement btnMenu = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu.click();
            MobileElement btnIniciarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]")));
            btnIniciarSesion.click();
            MobileElement txtEmail = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtEmail")));
            txtEmail.sendKeys(parametros[0]);
            MobileElement txtPass = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtpassword")));
            txtPass.sendKeys(parametros[1]);
            MobileElement btnLogin = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnlogin")));
            btnLogin.click();
            MobileElement btnCercanos = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")));
            btnCercanos.click();
            MobileElement el7 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView[1]")));
            el7.click();
            MobileElement el8 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageButton")));
            el8.click();
            MobileElement buttonFloatingToGo = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("com.nationalsoft.srapp:id/buttonFloatingToGo")));
            buttonFloatingToGo.click();
            MobileElement el10 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]")));
            el10.click();
            MobileElement txtProductName = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtProductName")));
            txtProductName.click();
            MobileElement btnAddCard = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnAddCard")));
            btnAddCard.click();
            MobileElement btnOption2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnOption2")));
            btnOption2.click();
            MobileElement btnPay = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnPay")));
            btnPay.click();
            MobileElement el15 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("Desplazarse hacia arriba")));
            el15.click();
            Thread.sleep(8000);
            btnMenu.click();
            MobileElement btnCerrarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]")));
            btnCerrarSesion.click();
            MobileElement button1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            button1.click();
            driver.navigate().back();
//            MobileElement el19 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
//            el19.click();
            btnCerrarSesion.click();
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }
}
