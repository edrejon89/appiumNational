package android;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class CP_4_CrearPerfilUsuario_Android extends BaseTestMac{



    @Test
    public void CP_4_CrearPerfilUsuario_AndroidTest() {

        try {
            Thread.sleep(8000);

            parametros = leerCSV("src/test/java/configuracion/CP4_Configuracion");
            MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Open");
            el2.click();
            MobileElement el3 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/img_pager_item")));
            el3.click();
            MobileElement el4 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/sign_in_button")));
            el4.click();
            //Con este elemento se selecciona la cuenta de google configurada en el telefono en caso de contar mas de una, en este caso selecciona la segunda opcion.
            MobileElement btnCG = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout")));
            btnCG.click();
//          boton para permitir permisos de google(Este boton se puede apagar una vez que la cuenta ya existe)
//          MobileElement btnPermitirGoo = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.gms:id/accept_button")));
//          btnPermitirGoo.click();
            MobileElement el6 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/imageprofile")));
            el6.click();
            MobileElement el7 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[1]")));
            el7.click();
            Thread.sleep(10000);
            driver.navigate().back();
            MobileElement el9 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/imageprofile")));
            el9.click();
            MobileElement el10 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.TextView[2]")));
            el10.click();
            MobileElement el11 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout/android.widget.ImageView[1]")));
            el11.click();
            MobileElement el12 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtBirthDate")));
            el12.click();
            MobileElement el13 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/menuToolbarSelect")));
            el13.click();
            MobileElement el14 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtMobile")));
            el14.click();
            MobileElement el17 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner/android.widget.TextView")));
            el17.click();
            MobileElement el18 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")));
            el18.click();
            MobileElement el15 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtMobile")));
            el15.sendKeys(parametros[0]);
            driver.navigate().back();
            MobileElement el16 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtallergy")));
            el16.sendKeys(parametros[1]);
            MobileElement el19 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnAccount")));
            el19.click();
            MobileElement el24 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/lblSkip")));
            el24.click();
            Thread.sleep(8000);
            MobileElement el25 = (MobileElement) driver.findElementByAccessibilityId("Open");
            Thread.sleep(2000);
            el25.click();
            MobileElement el26 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView")));
            el26.click();
            MobileElement el27 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            el27.click();
            Thread.sleep(2000);
            driver.navigate().back();
            MobileElement el28 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            el28.click();
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }


}
