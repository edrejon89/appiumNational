package iOS;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_27_VerHistorialPedidos_IOS extends BaseTestIOS_Win{

    @Test
    public void verHistorialPedidos(){
        try {
            parametros = leerCSV("src/test/java/configuracion/CP27_Configuracion");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' correo@ejemplo.com']"))).sendKeys(parametros[0]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' **********']"))).sendKeys(parametros[1]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Mis pedidos']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='UIAButton' and ./parent::*[@text='Mis pedidos']]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }
}
