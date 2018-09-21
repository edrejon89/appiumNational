package android;


import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class CP_25_RealizarPedidoUsandoCupon_Android extends BaseTest{
    @Test
    public void CP_25_RealizarPedidoUsandoCupon_AndroidTest(){

        try {
            Thread.sleep(8000);
            parametros =  leerCSV("src/test/java/configuracion/CP25_Configuracion");
            MobileElement btnOpen = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnOpen.click();
            MobileElement btnIniciar = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]")));
            btnIniciar.click();
            MobileElement footer = (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.nationalsoft.srapp:id/img_pager_item")));
            List promos = driver.findElements(By.className("android.widget.ImageView"));
            //List<MobileElement> promos = new ArrayList<MobileElement>(driver.findElements(By.id("com.nationalsoft.srapp:id/img_pager_item")));
            //Thread.sleep(2000);
            long segundos =  (long)(promos.size()-7)*5000;
            System.out.println(segundos);
            Thread.sleep(segundos);

            //Este tiempo va a depender de la cantidad de promociones de la aplicación, por cada aplicacion en tiempo debe aumentar 5 segundos.
            MobileElement img_pager_item = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/img_pager_item")));
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
            MobileElement btnLugareCercanos = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")));
            btnLugareCercanos.click();
            scrollAndClick(parametros[2]);
            MobileElement btnMenu = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageButton")));
            btnMenu.click();
            MobileElement btnToGo = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/buttonFloatingToGo")));
            btnToGo.click();
            MobileElement btnGrupo = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")));
            btnGrupo.click();
            MobileElement btnProducto = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout")));
            btnProducto.click();
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
