package android;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class CP_18_AgregarcuponDesdeLaPantalla_Android extends BaseTest {

    @Test
    public void agregarCuponPantalla(){
        try{
            Thread.sleep(8000);
            parametros =  leerCSV("src/test/java/configuracion/CP25_Configuracion");
            MobileElement btnOpen = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnOpen.click();
            MobileElement btnIniciar = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]")));
            btnIniciar.click();
            MobileElement txtEmail = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtEmail")));
            txtEmail.sendKeys(parametros[0]);
            MobileElement el4 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtpassword")));
            el4.sendKeys(parametros[1]);
            MobileElement btnlogin = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnlogin")));
            btnlogin.click();
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
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }
}
