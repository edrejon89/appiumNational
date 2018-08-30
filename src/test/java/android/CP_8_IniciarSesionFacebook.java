package android;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class CP_8_IniciarSesionFacebook extends BaseTest {


    @Test
    public void sampleTest() {
        try {
            Thread.sleep(8000);
            MobileElement btnMenu = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu.click();
            MobileElement btnIniciarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]")));
            btnIniciarSesion.click();
            driver.navigate().back();
            MobileElement btnFacebook = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/loginButton")));
            btnFacebook.click();
            MobileElement btnContinuar = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnAccount")));
            btnContinuar.click();
            driver.navigate().back();
            MobileElement btnOmitir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/lblSkip")));
            btnOmitir.click();
        }catch(Exception e){
            Assert.fail(e.getMessage());
        }

    }
}
