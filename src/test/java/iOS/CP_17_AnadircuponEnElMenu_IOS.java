package iOS;

import io.appium.java_client.ios.IOSElement;
import org.boon.di.In;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CP_17_AnadircuponEnElMenu_IOS extends BaseTestIOS_Win{

    @Test
    public void anadirCuponMenu(){
        try {
            parametros = leerCSV("src/test/java/configuracion/CP17_Configuracion");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' correo@ejemplo.com']"))).sendKeys(parametros[0]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' **********']"))).sendKeys(parametros[1]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Promociones']"))).click();
            List<IOSElement> promos = driver.findElements(By.xpath("//*[@text='Detalles']"));
            promos.get(Integer.parseInt(parametros[2])).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text=' AÑADIR A MIS PROMOCIONES']"))).click();
            //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@knownSuperClass='_UIButtonBarButton']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='UIAButton' and ./parent::*[@text='Promociones cercanas']]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();

        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }
}
