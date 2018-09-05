package android;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_9_AnadirDirecciones_Android extends BaseTest{

    @Test
    public void anadirDireccionesTest() {
        try {
            String[] parametros = leerCSV("src/test/java/configuracion/CP9_Configuracion");
            Thread.sleep(8000);
            MobileElement btnMenu = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu.click();
            MobileElement btnIniciarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]")));
            btnIniciarSesion.click();
            MobileElement txtEmail = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtEmail")));
            txtEmail.sendKeys(parametros[0]);
            Thread.sleep(2000);
            driver.navigate().back();
            MobileElement txtPassword = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtpassword")));
            txtPassword.sendKeys(parametros[1]);
            MobileElement btnLogin = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnlogin")));
            btnLogin.click();
            Thread.sleep(10000);
            MobileElement btnMenu2 = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu2.click();
            MobileElement btndirecciones = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[1]")));
            btndirecciones.click();
            MobileElement btnAgregarDir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnNewAddress")));
            btnAgregarDir.click();
            MobileElement txtIdentificador = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/identifier")));
            txtIdentificador.sendKeys(parametros[2]);
            MobileElement txtCalle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/street")));
            txtCalle.sendKeys(parametros[3]);
            MobileElement txtNoInterior = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/number")));
            txtNoInterior.sendKeys(parametros[4]);
            driver.navigate().back();
            MobileElement txtNoExterior = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/internal_number")));
            txtNoExterior.sendKeys(parametros[5]);
            MobileElement txtCruzamiento = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/intersection")));
            txtCruzamiento.sendKeys(parametros[6]);
            MobileElement txtCP = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/zipcode")));
            txtCP.sendKeys(parametros[7]);
            MobileElement txtMunicipio = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/municipality")));
            txtMunicipio.sendKeys(parametros[8]);
            MobileElement txtColonia = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/colony")));
            txtColonia.sendKeys(parametros[9]);
            scrollAndClick("Ciudad");
            MobileElement txtCiudad = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/city")));
            txtCiudad.sendKeys(parametros[10]);
            scrollAndClick("Referencias");
            MobileElement txtReferencia = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/references")));
            txtReferencia.sendKeys(parametros[11]);
            Thread.sleep(1000);
            MobileElement btnguardar = (MobileElement) driver.findElementByAccessibilityId("Guardar");
            btnguardar.click();
            Thread.sleep(2000);
            MobileElement btnBack = (MobileElement) driver.findElementByAccessibilityId("Navegar hacia arriba");
            btnBack.click();
            Thread.sleep(3000);
            MobileElement btnMenu3 = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu3.click();
            MobileElement btnCerrarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]")));
            btnCerrarSesion.click();
            MobileElement btnConfirmar = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            btnConfirmar.click();
        }catch(Exception e){
            Assert.fail(e.getMessage());
        }

    }

}
