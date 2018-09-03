package android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_15_FiltrarPorOtraUbicacion extends BaseTest{

    @Test
    public void filtrarPorrOtraUbicacion() {
        try {
            MobileElement btnRestaurantes = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")));
            btnRestaurantes.click();
            Thread.sleep(4000);
            MobileElement btnDireccion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/lblLocation")));
            String dirOriginial = btnDireccion.getText();
            btnDireccion.click();
            MobileElement btnElegirDirMapa = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnOption2")));
            btnElegirDirMapa.click();
            Thread.sleep(3000);
            (new TouchAction(driver)).tap(529, 887).perform();
            Thread.sleep(1000);
            MobileElement btnConfirmar = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.gms:id/confirm_button")));
            btnConfirmar.click();
            MobileElement btnDireccion2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/lblLocation")));
            String dirModificada = btnDireccion2.getText();
            Assert.assertNotEquals(dirOriginial, dirModificada);

        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }

}
