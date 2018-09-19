package iOS;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import org.boon.di.In;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CP_20_RealizarPedidoSesionIniciada_IOS extends BaseTestIOS_Win{
    @Test
    public void CP_20_RealizarPedidoSesionIniciada_IOSTest(){

        try {
            parametros=leerCSV("src/test/java/configuracion/CP20_Configuracion");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' correo@ejemplo.com']"))).sendKeys(parametros[0]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' **********']"))).sendKeys(parametros[1]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Vegetariana' and @class='UIAStaticText' and ./parent::*[@class='UIAView']]"))).click();
            //Se utilizan listas para parametrizar el restaurante y los productos por medio de indices
            Thread.sleep(5000);
            List<IOSElement> rest = driver.findElements(By.xpath("//*[@name='ic_room_pointGps']"));
            int index = Integer.parseInt(parametros[2]) + 1;
            rest.get(index).click();
            Thread.sleep(5000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='  ORDENAR DEL MENU']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Pasar a recoger']"))).click();
            List<IOSElement> grupos = driver.findElements(By.xpath("//*[@name='More Info']"));
            index = Integer.parseInt(parametros[3]) - 1;
            grupos.get(index).click();
            List<IOSElement> producs = driver.findElements(By.xpath("//*[@XCElementType='XCUIElementTypeTextView']"));
            producs.get(0).click();
            Thread.sleep(5000);
            /*wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='LUNCH $95']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='1/2 BAGUETTE' and @class='UIAStaticText']"))).click();
            */wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text=' PAGAR COMPRA']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='   ORDENAR']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CONFIRMAR']"))).click();
            Thread.sleep(20000);//Espera para evitar que se haga clic sobre la notificación de correo electrónico
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='UIAButton' and ./parent::*[@text='Mi pedido']]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ic keyboard backspace']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//*[@class='UIATable' and ./parent::*[./parent::*[./parent::*[@class='UIAView']]]]/*[@class='UIAView'])[1]/*[@text='ic keyboard backspace'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//*[@class='UIATable' and (./preceding-sibling::* | ./following-sibling::*)[@text='  ORDENAR DEL MENU']]/*[@class='UIAView'])[1]/*[@text='ic keyboard backspace'])[2]"))).click();
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
