package iOS;

import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_3_SyncVisualizacionProductosSincronizados_IOS extends BaseTestIOS_Mac {

    @Test
    public void CP_3_SyncVisualizacionProductosSincronizados_IOSTest(){

        try {
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' correo@ejemplo.com']"))).sendKeys("walook.pruebas@gmail.com");
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' **********']"))).sendKeys("Admin123");
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']"))).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[2]"))).click();

//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='W']"))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='a']"))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='l']"))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='o']"))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='o']"))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='k']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Restaurante...']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Restaurante...']"))).sendKeys("Walook");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Buscar']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Italiana' and @class='UIAStaticText' and ./parent::*[@class='UIAView']]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='  ORDENAR DEL MENU']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Pasar a recoger']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='GIOCONDA LUNCH $77']")));
//            IOSElement elem = driver.findElement(By.xpath("//*[@text='GIOCONDA LUNCH $77']"));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//*[@class='UIATable' and ./parent::*[./parent::*[./parent::*[@class='UIAView']]]]/*[@class='UIAView'])[1]/*[@text='ic keyboard backspace'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//*[@class='UIATable' and ./parent::*[./parent::*[./parent::*[@class='UIAView']]]]/*[@class='UIAView'])[1]/*[@text='ic keyboard backspace'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Restaurantes']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Perfil']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Perfil']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Restaurantes']/*[@class='UIAButton'])[1]"))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }
}
