package android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_13_FiltrarPorNombre_Android extends  BaseTest {


    @Test
    public void CP_13_FiltrarPorNombre_AndroidTest() {

        try {
            parametros = leerCSV("src/test/java/configuracion/CP13_Configuracion");
            MobileElement btnBuscar = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/btnSearchDirectory")));
            btnBuscar.click();
            MobileElement cajaBusqueda = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.nationalsoft.srapp:id/search_src_text")));
            cajaBusqueda.sendKeys(parametros[0]);
            Thread.sleep(2000);
            (new TouchAction(driver)).tap(991,1684).perform();
            Thread.sleep(2000);
            driver.navigate().back();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }





}
