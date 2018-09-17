package iOS;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CP_16_CambiarUbicacionDireccionesGuardadas_IOS extends BaseTestIOS_Mac {
    @Test
    public void CP_16_CambiarUbicacionDireccionesGuardadas_IOSTest() {

        try {
            parametros = leerCSV("src/test/java/configuracion/CP16_Configuracion");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder=' correo@ejemplo.com']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' correo@ejemplo.com']"))).sendKeys(parametros[0]);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder=' **********']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' **********']"))).sendKeys(parametros[1]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Vegetariana' and @class='UIAStaticText' and ./parent::*[@class='UIAView']]")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Vegetariana' and @class='UIAStaticText' and ./parent::*[@class='UIAView']]"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Calle 18, No.115']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Calle 18, No.115']"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Mis direcciones' and @class='UIAButton']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Mis direcciones' and @class='UIAButton']"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='C. 00, Vista Alegre Lotificacion, Mérida' and (./preceding-sibling::* | ./following-sibling::*)[@text='identif0.08360239298048433']]")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='C. 00, Vista Alegre Lotificacion, Mérida' and (./preceding-sibling::* | ./following-sibling::*)[@text='identif0.08360239298048433']]"))).click();
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
