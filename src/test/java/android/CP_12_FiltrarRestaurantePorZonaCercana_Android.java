package android;


import org.junit.Assert;
import org.junit.Test;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_12_FiltrarRestaurantePorZonaCercana_Android extends BaseTestMac{

    @Test
    public void CP_12_FiltrarRestaurantePorZonaCercana_AndroidTest(){

        try {
            MobileElement el1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView")));
            el1.click();
            Thread.sleep(8000);
            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().back();
            MobileElement el2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            Thread.sleep(1000);
            el2.click();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }
}
