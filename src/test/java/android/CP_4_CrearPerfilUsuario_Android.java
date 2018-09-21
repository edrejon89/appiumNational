package android;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class CP_4_CrearPerfilUsuario_Android extends BaseTest{



    @Test
    public void CP_4_CrearPerfilUsuario_AndroidTest() {

        try {
            Thread.sleep(8000);

            parametros = leerCSV("src/test/java/configuracion/CP4_Configuracion");
            MobileElement btnMenu = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu.click();
            MobileElement btnCrearcuenta = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/img_pager_item")));
            btnCrearcuenta.click();
            MobileElement btnRegGoogle = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/sign_in_button")));
            btnRegGoogle.click();
            //Con este elemento se selecciona la cuenta de google configurada en el telefono en caso de contar mas de una, en este caso selecciona la segunda opcion.
            String cuenta = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout["+ parametros[0] +"]/android.widget.LinearLayout";
            MobileElement btnOpcionCuenta = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(cuenta)));
            btnOpcionCuenta.click();

  //        boton para permitir permisos de google(Este boton se puede apagar una vez que la cuenta ya existe)
            List btnPermitirGoo = driver.findElements(By.id("com.google.android.gms:id/accept_button"));
            if (!btnPermitirGoo.isEmpty()){
                MobileElement btnGoo = (MobileElement) btnPermitirGoo.get(0);
                btnGoo.click();
            }

            MobileElement btnImagen = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/imageprofile")));
            btnImagen.click();
            MobileElement btnCamara = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[1]")));
            btnCamara.click();
            Thread.sleep(10000);
            driver.navigate().back();
            //driver.navigate().back();
            MobileElement btnImagen2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/imageprofile")));
            btnImagen2.click();
            MobileElement btnGaleria = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[2]")));
            btnGaleria.click();
            driver.navigate().back();
            //MobileElement el11 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.ImageView[1]")));
            //el11.click();
            MobileElement txtNacimiento = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtBirthDate")));
            txtNacimiento.click();
            MobileElement btnListo = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/menuToolbarSelect")));
            btnListo.click();
            /*MobileElement txtNumero = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtMobile")));
            txtNumero.click();*/
            MobileElement btnGenero = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner/android.widget.TextView")));
            btnGenero.click();
            MobileElement btnMasculino = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")));
            btnMasculino.click();
            MobileElement txtNumero2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtMobile")));
            txtNumero2.sendKeys(parametros[1]);
            //driver.navigate().back();
            MobileElement txtAlergia = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtallergy")));
            txtAlergia.sendKeys(parametros[2]);
            MobileElement btnContinuar = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnAccount")));
            btnContinuar.click();
            MobileElement btnOmitir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/lblSkip")));
            btnOmitir.click();
            Thread.sleep(8000);
            MobileElement btnMenu2 = (MobileElement) driver.findElementByAccessibilityId("Open");
            Thread.sleep(2000);
            btnMenu2.click();
            MobileElement btnCerrarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView")));
            btnCerrarSesion.click();
            MobileElement btnConfirmarSalir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            btnConfirmarSalir.click();
            Thread.sleep(2000);
            driver.navigate().back();
            MobileElement el28 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            el28.click();
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }


}
