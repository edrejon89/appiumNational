package android;


import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_25_RealizarPedidoUsandoCupon_Android extends BaseTestMac{
    @Test
    public void CP_25_RealizarPedidoUsandoCupon_AndroidTest(){

        try {
            Thread.sleep(8000);
            MobileElement btnOpen = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnOpen.click();
            MobileElement btnIniciar = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]")));
            btnIniciar.click();
            MobileElement txtEmail = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtEmail")));
            txtEmail.sendKeys("walook.pruebas@gmail.com");
            MobileElement el4 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtpassword")));
            el4.sendKeys("Admin123");
            MobileElement btnlogin = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnlogin")));
            btnlogin.click();
            MobileElement img_pager_item = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/img_pager_item")));
            //Este tiempo va a depender de la cantidad de promociones de la aplicación, por cada aplicacion en tiempo debe aumentar 5 segundos.
            Thread.sleep(45000);
            img_pager_item.click();
            MobileElement titlePay = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/titlePay")));
            String tpay= titlePay.getText();
            if (tpay.equals("¡YA CUENTAS CON ESTA PROMOCIÓN!")){
                driver.navigate().back();
            }else{
                titlePay.click();
                MobileElement btnOkSi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
                btnOkSi.click();
            }
            MobileElement el10 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")));
            el10.click();
            scrollAndClick("Walook");
            MobileElement el12 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageButton")));
            el12.click();
            MobileElement el13 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/buttonFloatingToGo")));
            el13.click();
            MobileElement el14 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")));
            el14.click();
            MobileElement el15 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout")));
            el15.click();
            MobileElement btnincrement = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnincrement")));
            btnincrement.click();
            Thread.sleep(1000);
            btnincrement.click();
            MobileElement btnAddCard = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnAddCard")));
            btnAddCard.click();
            MobileElement btnOption2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnOption2")));
            btnOption2.click();
            MobileElement el19 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.TableLayout/android.widget.TableRow[3]/android.widget.RelativeLayout")));
            el19.click();
            MobileElement btnDetail = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnDetail")));
            btnDetail.click();
            MobileElement btnPay = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnPay")));
            btnPay.click();
            Thread.sleep(8000);
            MobileElement navUp = (MobileElement) driver.findElementByAccessibilityId("Navegar hacia arriba");
            navUp.click();
            Thread.sleep(8000);
            btnOpen = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnOpen.click();
            MobileElement el30 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]")));
            el30.click();
            MobileElement btnOkSi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            btnOkSi.click();
            Thread.sleep(3000);
            driver.navigate().back();
            btnOkSi = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            btnOkSi.click();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }


}
