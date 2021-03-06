package android;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CP_17_AgregarCuponMedianteMenu_Android extends  BaseTest{

    @Test
    public  void Cp_17_AgregarCuponMedianteMenu_AndroidTest(){

        try {
            parametros = leerCSV("src/test/java/configuracion/CP17_Configuracion");
            Thread.sleep(8000);
            MobileElement btnMenu = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu.click();
            MobileElement btnIniciarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]")));
            btnIniciarSesion.click();
            MobileElement txtEmail = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtEmail")));
            txtEmail.sendKeys(parametros[0]);
            MobileElement txtpassword = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtpassword")));
            txtpassword.sendKeys(parametros[1]);
            MobileElement btnlogin = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnlogin")));
            btnlogin.click();
            /*MobileElement button1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            button1.click();
            txtEmail = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtEmail")));
            Thread.sleep(2000);
            txtEmail.clear();
            Thread.sleep(2000);

            txtEmail.sendKeys(parametros[2]);
            btnlogin= (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnlogin")));
            Thread.sleep(2000);

            btnlogin.click();*/
            Thread.sleep(15000);

            btnMenu = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu.click();
            MobileElement btnPromociones = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]")));
            btnPromociones.click();
            String promo = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[" + parametros[2] + "]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button";
            MobileElement promocion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(promo)));
            promocion.click();

            List btnAgregar = driver.findElements(By.id("com.nationalsoft.srapp:id/btnSaveCoupon"));
            if (!btnAgregar.isEmpty()){
                MobileElement btnAdd = (MobileElement) btnAgregar.get(0);
                btnAdd.click();
                MobileElement btnOk = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
                btnOk.click();

            }else{
                Thread.sleep(8000);
                MobileElement btnREgresar = (MobileElement) driver.findElementByAccessibilityId("Navegar hacia arriba");
                btnREgresar.click();
            }
            Thread.sleep(8000);
            MobileElement btnREgresar = (MobileElement) driver.findElementByAccessibilityId("Navegar hacia arriba");
            btnREgresar.click();
            Thread.sleep(8000);

            btnMenu = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu.click();
            MobileElement btnCerrarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]")));
            btnCerrarSesion.click();
            MobileElement btnConfirmarSalir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            btnConfirmarSalir.click();
            /*Thread.sleep(8000);
            driver.navigate().back();
            button1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            Thread.sleep(2000);
            button1.click();*/
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}
