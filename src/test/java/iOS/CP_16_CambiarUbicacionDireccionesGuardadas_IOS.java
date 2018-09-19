package iOS;

import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CP_16_CambiarUbicacionDireccionesGuardadas_IOS extends BaseTestIOS_Win {
    @Test
    public void CP_16_CambiarUbicacionDireccionesGuardadas_IOSTest() {

        try {
            parametros = leerCSV("src/test/java/configuracion/CP16_Configuracion");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' correo@ejemplo.com']"))).sendKeys(parametros[0]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' **********']"))).sendKeys(parametros[1]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Vegetariana' and @class='UIAStaticText' and ./parent::*[@class='UIAView']]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ic_map_white']"))).click();
           // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Calle 18, No.115']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Mis direcciones' and @class='UIAButton']"))).click();
            Thread.sleep(5000);
            List<IOSElement> dirs = driver.findElements(By.xpath("//*[@name='ic_room_pointGps']"));
            //selecciona por defecto la primera direccion guardada
            dirs.get(1).click();
            //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='C. 00, Vista Alegre Lotificacion, Mérida' and (./preceding-sibling::* | ./following-sibling::*)[@text='identif0.08360239298048433']]"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Seleccionar']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Seleccionar']"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@text='Restaurantes']/*[@class='UIAButton'])[1]")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Restaurantes']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

}
