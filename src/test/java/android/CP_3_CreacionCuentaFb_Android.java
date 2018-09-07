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
            parametros = leerCSV("src/test/java/configuracion/CP3_Configuracion");
            Thread.sleep(8000);
            MobileElement btnOpen = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnOpen.click();
            MobileElement btnCrearCuenta = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[1]")));
            btnCrearCuenta.click();
            MobileElement loginButton = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/loginButton")));
            loginButton.click();
            MobileElement btnPermisoFB = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button")));
            btnPermisoFB.click();
            Thread.sleep(2000);
            MobileElement txtBirthDate = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtBirthDate")));
            txtBirthDate.sendKeys(parametros[0]);
            MobileElement comboSexo = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner/android.widget.TextView")));
            comboSexo.click();
            MobileElement opMasculino = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")));
            opMasculino.click();
            MobileElement txtallergy = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtallergy")));
            txtallergy.sendKeys(parametros[1]);
            MobileElement btnAccount = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnAccount")));
            btnAccount.click();
            MobileElement street = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/street")));
            street.sendKeys(parametros[2]);
            driver.navigate().back();
            MobileElement number = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/number")));
            number.sendKeys(parametros[3]);
            MobileElement intersection = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/intersection")));
            intersection.sendKeys(parametros[4]);
            MobileElement zipcode = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/zipcode")));
            zipcode.sendKeys(parametros[5]);
            MobileElement municipality = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/municipality")));
            municipality.sendKeys(parametros[6]);
            MobileElement colony = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/colony")));
            colony.sendKeys(parametros[7]);
            (new TouchAction(driver))
                    .press(1014, 1347)
                    .moveTo(1006, 495)
                    .release()
                    .perform();
            MobileElement city = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/city")));
            city.sendKeys(parametros[8]);
            MobileElement references = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/references")));
            references.sendKeys(parametros[9]);
            MobileElement btnContinue = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnContinue")));
            btnContinue.click();
            Thread.sleep(2000);
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }

}
