package android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_1_CrearCuenta_Android extends BaseTest {

    @Test
    public void sampleTest() {
        try {
            parametros = leerCSV("src/test/java/configuracion/CP1_Configuracion");
            Thread.sleep(8000);
            MobileElement btnMenu = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu.click();
            MobileElement btnCrearCuenta = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[1]")));
            btnCrearCuenta.click();
            driver.navigate().back();
            MobileElement txtNombre = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtName")));
            txtNombre.sendKeys(parametros[0]);
            driver.navigate().back();
            MobileElement txtApellido = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtLastName")));
            txtApellido.sendKeys(parametros[1]);
            driver.navigate().back();
            MobileElement txtEmail = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtEmail")));
            txtEmail.sendKeys(parametros[2]);
            driver.navigate().back();
            MobileElement txtPassword = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtpassword")));
            txtPassword.sendKeys(parametros[3]);
            driver.navigate().back();
            MobileElement confirmPassword = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtconfirmpassword")));
            confirmPassword.sendKeys(parametros[3]);
            driver.navigate().back();
            MobileElement btnCrear = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnAccount")));
            btnCrear.click();
            MobileElement btnOmitir1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnSkip")));
            btnOmitir1.click();
            driver.navigate().back();
            MobileElement btnOmitir2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/lblSkip")));
            btnOmitir2.click();
            Thread.sleep(5000);
            MobileElement btnMenuu = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenuu.click();
            MobileElement btnCerrarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]")));
            btnCerrarSesion.click();
            MobileElement btnAceptar = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            btnAceptar.click();
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }


}
