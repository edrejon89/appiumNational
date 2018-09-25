package iOS;

import io.appium.java_client.ios.IOSElement;
import org.apache.xmlrpc.util.LimitedInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.util.List;


public class CP_3_SyncVisualizacionProductosSincronizados_IOS extends BaseTestIOS_Win {

    @Test
    public void CP_3_SyncVisualizacionProductosSincronizados_IOSTest(){

        try {

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[2]"))).click();


            parametros = leerCSV("src/test/java/configuracion/CP3_Sincronizador");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' correo@ejemplo.com']"))).sendKeys("walook.pruebas@gmail.com");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' **********']"))).sendKeys("Admin123");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']"))).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Restaurante...']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Restaurante...']"))).sendKeys("Walook");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Buscar']"))).click();
            Thread.sleep(5000);
            List rest = driver.findElements(By.xpath("//*[@name='ic_room_pointGps']"));
            IOSElement restaurant = (IOSElement) rest.get(2);
            restaurant.click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='  ORDENAR DEL MENU']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Pasar a recoger']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='GIOCONDA LUNCH $77']")));
//            IOSElement elem = driver.findElement(By.xpath("//*[@text='GIOCONDA LUNCH $77']"));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//*[@class='UIATable' and ./parent::*[./parent::*[./parent::*[@class='UIAView']]]]/*[@class='UIAView'])[1]/*[@text='ic keyboard backspace'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//*[@class='UIATable' and ./parent::*[./parent::*[./parent::*[@class='UIAView']]]]/*[@class='UIAView'])[1]/*[@text='ic keyboard backspace'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Restaurantes']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='A domicilio']"))).click();
            Thread.sleep(5000);
            List paquetes = driver.findElements(By.xpath("//*[@name='More Info']"));
            int index = Integer.parseInt(parametros[1])-1;
            System.out.println(index);
            IOSElement paqueteElegido = (IOSElement) paquetes.get(index);
            paqueteElegido.click();
            Thread.sleep(15000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ic keyboard backspace']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ic keyboard backspace']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ic keyboard backspace']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@knownSuperClass='_UIButtonBarButton']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }
}
