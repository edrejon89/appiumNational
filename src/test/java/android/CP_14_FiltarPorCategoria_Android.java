package android;

import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import sun.jvm.hotspot.debugger.ThreadAccess;

public class CP_14_FiltarPorCategoria_Android extends  BaseTestMac{
    @Test
    public void CP_14_FiltarPorCategoria_AndroidTest(){

        try {
            Thread.sleep(8000);

            MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView");
            el1.click();
            Thread.sleep(8000);

            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(4000);
            MobileElement el2 = (MobileElement) driver.findElementById("android:id/button1");
            el2.click();

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}
