package android;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_19_AgregarUnCuponEnElRestaurante_Android extends BaseTest {

    @Test
    public void agregarUnCuponEnElRestaurante() {
        try {
            String[] parametros = leerCSV("src/test/java/configuracion/CP19_Configuracion");
            Thread.sleep(8000);
            MobileElement btnMenu = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu.click();
            MobileElement btnIniciarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]")));
            btnIniciarSesion.click();
            MobileElement txtEmail = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtEmail")));
            txtEmail.sendKeys(parametros[0]);
            MobileElement txtPassword = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtpassword")));
            txtPassword.sendKeys(parametros[1]);
            MobileElement btnLogin = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnlogin")));
            btnLogin.click();
            MobileElement btnBuscar = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnSearchDirectory")));
            btnBuscar.click();
            MobileElement barraBuscador = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/search_src_text")));
            barraBuscador.sendKeys(parametros[2]);
            Thread.sleep(1000);
            (new TouchAction(driver)).tap(937, 1652).perform();
            Thread.sleep(500);
            MobileElement primerRestaurant = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout")));
            primerRestaurant.click();
            MobileElement btnOpciones = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageView")));
            btnOpciones.click();
            MobileElement btnPromociones = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/buttonFloatingPromo")));
            btnPromociones.click();
            String cupon = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[" + parametros[3] + "]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.Button";
            MobileElement btnDetalleCupon = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cupon)));
            btnDetalleCupon.click();
            MobileElement btnAgregarCupon = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnSaveCoupon")));
            btnAgregarCupon.click();
            MobileElement btnConfirmarAgregar = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            btnConfirmarAgregar.click();
            Thread.sleep(3000);
            MobileElement btnRegresar1 = (MobileElement) driver.findElementByAccessibilityId("Navegar hacia arriba");
            btnRegresar1.click();
            Thread.sleep(2000);
            MobileElement btnRegresar2 = (MobileElement) driver.findElementByAccessibilityId("Navegar hacia arriba");
            btnRegresar2.click();
            Thread.sleep(8000);
            MobileElement btnRegresar3 = (MobileElement) driver.findElementByAccessibilityId("Contraer");
            btnRegresar3.click();
            Thread.sleep(5000);
            MobileElement btnMenu2 = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu2.click();
            MobileElement btnCerrarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]")));
            btnCerrarSesion.click();
            MobileElement btnConfirmarSalir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            btnConfirmarSalir.click();
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }
}

