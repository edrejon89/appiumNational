package android;

import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_14_FiltarPorCategoria_Android extends  BaseTestMac{
    @Test
    public void CP_14_FiltarPorCategoria_AndroidTest(){

        try {
            Thread.sleep(5000);
////            (new TouchAction(driver))
////                    .press(437, 1606)
////                     .moveTo(430, 1196)
////                     .release()
////                    .perform();
////            (new TouchAction(driver))
////                    .press( 480, 1715)
////                    .moveTo(499, 937)
////                    .release()
////                    .perform();
//            MobileElement el1 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView")));
//            el1.click();
//            Thread.sleep(1000);
//            driver.navigate().back();
//            Thread.sleep(1000);
//            driver.navigate().back();
//            MobileElement el2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
//            el2.click();
            MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView");
            el1.click();
            driver.navigate().back();
            driver.navigate().back();
            driver.navigate().back();
            driver.navigate().back();
            MobileElement el2 = (MobileElement) driver.findElementById("android:id/button1");
            el2.click();

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}
