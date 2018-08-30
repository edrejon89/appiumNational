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
            MobileElement btnMenu = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu.click();
            Thread.sleep(2000);
            MobileElement btnCrearCuenta = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[1]");
            btnCrearCuenta.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement txtNombre = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtName");
            txtNombre.sendKeys(parametros[0]);
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement txtApellido = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtLastName");
            txtApellido.sendKeys(parametros[1]);
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement txtEmail = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtEmail");
            txtEmail.sendKeys(parametros[2]);
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement txtPassword = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtpassword");
            txtPassword.sendKeys(parametros[3]);
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement confirmPassword = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/txtconfirmpassword");
            confirmPassword.sendKeys(parametros[3]);
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement btnCrear = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/btnAccount");
            btnCrear.click();
            Thread.sleep(2000);
            MobileElement btnOmitir1 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/btnSkip");
            btnOmitir1.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            MobileElement btnOmitir2 = (MobileElement) driver.findElementById("com.nationalsoft.srapp:id/lblSkip");
            btnOmitir2.click();
            Thread.sleep(2000);
            MobileElement btnMenuu = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenuu.click();
            Thread.sleep(2000);
            MobileElement btnCerrarSesion = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]");
            btnCerrarSesion.click();
            Thread.sleep(2000);
            MobileElement btnAceptar = (MobileElement) driver.findElementById("android:id/button1");
            Thread.sleep(2000);
            btnAceptar.click();
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }


}
