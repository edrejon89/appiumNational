package android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_3_SyncVisualizacionProductosSincronizados_Android  extends BaseTest{

    @Test
    public void visualizacionProductosSincronizados(){
        try {
            parametros = leerCSV("src/test/java/configuracion/CP3_Sincronizador");
            MobileElement btnBuscar = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnSearchDirectory")));
            btnBuscar.click();
            MobileElement cajaBusqueda = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/search_src_text")));
            cajaBusqueda.sendKeys(parametros[0]);
            Thread.sleep(2000);
            (new TouchAction(driver)).tap(991,1684).perform();
            Thread.sleep(2000);
            MobileElement primerRestaurant = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout")));
            primerRestaurant.click();
            MobileElement btnOpciones = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageButton")));
            btnOpciones.click();
            MobileElement btnServicioDomicilio = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/buttonFloatingDelivery")));
            btnServicioDomicilio.click();
            String paquete = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[" + parametros[1] + "]";
            MobileElement btnPaquete = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(paquete)));
            btnPaquete.click();
            Thread.sleep(30000);

        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }
}
