package  android;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_3_CreacionCuentaFb_Android extends BaseTest {


    @Test
    public void CP_3_CreacionCuentaFb_AndroidTest() {
        //Para la ejecución de esta prueba se requiere eliminar el inicio de sesión de fb en la app, esto desde las configuraciones de privacidad de fb
        try {
            Thread.sleep(8000);
            MobileElement btnOpen = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnOpen.click();
            MobileElement btnCrearCuenta = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[1]")));
            btnCrearCuenta.click();
            MobileElement btnLoginFacebook = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/loginButton")));
            btnLoginFacebook.click();
            MobileElement btnOmitir1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnSkip")));
            btnOmitir1.click();
            MobileElement btnOmitir2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/lblSkip")));
            btnOmitir2.click();
            Thread.sleep(8000);
            MobileElement btnMenu = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu.click();
            MobileElement btnCerrarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]")));
            btnCerrarSesion.click();
            MobileElement btnConfirmarSalir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            btnConfirmarSalir.click();

        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }

}
