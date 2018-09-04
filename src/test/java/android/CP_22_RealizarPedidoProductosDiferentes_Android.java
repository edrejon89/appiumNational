package android;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_22_RealizarPedidoProductosDiferentes_Android extends BaseTest{

    @Test
    public void realizarPedidoDiferentesProductos(){
        try{
            String[] parametros =leerCSV("src/test/java/configuracion/CP22_Configuracion");
            Thread.sleep(8000);
            MobileElement btnMenu = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu.click();
            MobileElement btnIniciarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]")));
            btnIniciarSesion.click();
            MobileElement txtEmail = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtEmail")));
            txtEmail.sendKeys(parametros[0]);
            MobileElement txtPassword = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/txtpassword")));
            txtPassword.sendKeys(parametros[1]);
            MobileElement btnLogin = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnlogin")));
            btnLogin.click();
            MobileElement btnLugaresCercanos = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")));
            btnLugaresCercanos.click();
            MobileElement btnRestaurante = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]")));
            btnRestaurante.click();
            MobileElement btnOpciones = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageButton")));
            btnOpciones.click();
            MobileElement btnARecoger = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/buttonFloatingToGo")));
            btnARecoger.click();
            String grupo = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[" + parametros[2]+ "]";
            MobileElement btnGrupo = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(grupo)));
            btnGrupo.click();
            String producto = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[" + parametros[3] + "]/android.widget.RelativeLayout";
            MobileElement btnProducto = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(producto)));
            btnProducto.click();
            MobileElement btnOrdenarPedido = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnAddCard")));
            btnOrdenarPedido.click();
            MobileElement btnSeguirOrdenando = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnOption1")));
            btnSeguirOrdenando.click();
            Thread.sleep(8000);
            MobileElement btnRegresar1 = (MobileElement) driver.findElementByAccessibilityId("Navegar hacia arriba");
            btnRegresar1.click();
            String grupo2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[" + parametros[4] + "]";
            MobileElement btnGrupo2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(grupo2)));
            btnGrupo2.click();
            String producto2 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[" + parametros[5] + "]/android.widget.RelativeLayout";
            MobileElement btnProducto2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath(producto2)));
            btnProducto2.click();
            MobileElement btnOrdenarPedido2 = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnAddCard")));
            btnOrdenarPedido2.click();
            MobileElement btnFinalizarPedido = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnOption2")));
            btnFinalizarPedido.click();
            MobileElement btnOrdenar = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnPay")));
            btnOrdenar.click();
            Thread.sleep(15000);
            MobileElement btnRegresar = (MobileElement) driver.findElementByAccessibilityId("Navegar hacia arriba");
            btnRegresar.click();
            Thread.sleep(5000);
            MobileElement btnMenu2 = (MobileElement) driver.findElementByAccessibilityId("Open");
            btnMenu2.click();
            MobileElement btnCerrarSesion = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]")));
            btnCerrarSesion.click();
            MobileElement btnConfirmarSalir = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
            btnConfirmarSalir.click();
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }


}
