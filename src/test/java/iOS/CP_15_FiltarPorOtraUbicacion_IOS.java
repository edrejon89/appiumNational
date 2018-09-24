package iOS;

import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_15_FiltarPorOtraUbicacion_IOS extends BaseTestIOS_Mac {
    @Test
    public void CP15_FiltarPorOtraUbicacion_IOSTest(){
        try {
            parametros = leerCSV("src/test/java/configuracion/CP15_Configuracion");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' correo@ejemplo.com']"))).sendKeys(parametros[0]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' **********']"))).sendKeys(parametros[1]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Vegetariana' and @class='UIAStaticText' and ./parent::*[@class='UIAView']]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ic_map_white']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Elegir ubicación de mapa']"))).click();
            Thread.sleep(5000);
            new TouchAction(driver).press(455, 513).waitAction(799).moveTo(470, 466).release().perform();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text=' Seleccionar la ubicación']"))).click();
            Thread.sleep(10000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Restaurantes']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}
