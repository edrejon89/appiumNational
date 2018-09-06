package android;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;

public class CP_14_FiltarPorCategoria_Android extends  BaseTest{
    @Test
    public void CP_14_FiltarPorCategoria_AndroidTest(){

        try {
            String[] parametros = leerCSV("src/test/java/configuracion/CP14_Configuracion");
            Thread.sleep(8000);
            String categoria = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[" + parametros[0] + "]/android.widget.ImageView";
            MobileElement btnCategoria = (MobileElement) driver.findElementByXPath(categoria);
            btnCategoria.click();
            Thread.sleep(8000);

            driver.navigate().back();
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(4000);
            MobileElement btnconfirmarSalir = (MobileElement) driver.findElementById("android:id/button1");
            btnconfirmarSalir.click();

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}
