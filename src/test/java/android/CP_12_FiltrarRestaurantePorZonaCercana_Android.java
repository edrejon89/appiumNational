package android;


import org.junit.Assert;
import org.junit.Test;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_12_FiltrarRestaurantePorZonaCercana_Android extends BaseTest{

    @Test
    public void CP_12_FiltrarRestaurantePorZonaCercana_AndroidTest(){

        try {
            MobileElement btnLugaresCercanos = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView")));
            btnLugaresCercanos.click();
            Thread.sleep(8000);
            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().back();
            MobileElement btnConfirmarSalir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            Thread.sleep(1000);
            btnConfirmarSalir.click();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }
}
