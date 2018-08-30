package  android;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_3_CreacionCuentaFb_Android extends BaseTestMac {


    @Test
    public void CP_3_CreacionCuentaFb_AndroidTest() {
        try {
            parametros = leerCSV("src/test/java/configuracion/CP3_Configuracion");
            Thread.sleep(8000);
            MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Open");
            el2.click();
            MobileElement el3 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/img_pager_item")));
            el3.click();
            MobileElement el4 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/loginButton")));
            el4.click();
            MobileElement el10 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtBirthDate")));
            el10.clear();
            el10.sendKeys(parametros[0]);
            MobileElement el11 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner/android.widget.TextView")));
            el11.click();
            MobileElement el12 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")));
            el12.click();
            MobileElement el13 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtallergy")));
            el13.sendKeys(parametros[1]);
            (new TouchAction(driver))
                    .press(1022, 1413)
                    .moveTo(999, 569)
                    .release()
                    .perform();
            (new TouchAction(driver))
                    .press(1022, 1425)
                    .moveTo(1010, 441)
                    .release()
                    .perform();
            MobileElement el14 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnAccount")));
            el14.click();
            MobileElement el15 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/street")));
            el15.sendKeys(parametros[2]);
            driver.navigate().back();
            MobileElement el16 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/number")));
            el16.sendKeys(parametros[3]);
            MobileElement el17 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/intersection")));
            MobileElement el18 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/intersection")));
            el18.sendKeys(parametros[4]);
            MobileElement el19 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/zipcode")));
            el19.sendKeys(parametros[5]);
            MobileElement el20 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/municipality")));
            el20.sendKeys(parametros[6]);
            MobileElement el21 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/colony")));
            el21.sendKeys(parametros[7]);
            (new TouchAction(driver))
                    .press(1014, 1347)
                    .moveTo(1006, 495)
                    .release()
                    .perform();
            MobileElement el22 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/city")));
            el22.sendKeys(parametros[8]);
            MobileElement el23 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/references")));
            el23.sendKeys(parametros[9]);
            MobileElement el24 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnContinue")));
            el24.click();
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }

}
