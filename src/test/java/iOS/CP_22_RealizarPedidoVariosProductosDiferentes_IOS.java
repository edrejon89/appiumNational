package iOS;

import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CP_22_RealizarPedidoVariosProductosDiferentes_IOS extends BaseTestIOS_Mac{

    @Test
    public void CP_22_RealizarPedidoVariosProductosDiferentes_IOSTest (){


        try {
            parametros=leerCSV("src/test/java/configuracion/CP22_Configuracion");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' correo@ejemplo.com']"))).sendKeys(parametros[0]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' **********']"))).sendKeys(parametros[1]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Vegetariana' and @class='UIAStaticText' and ./parent::*[@class='UIAView']]"))).click();
            Thread.sleep(5000);
            List<IOSElement> rest =  driver.findElements(By.xpath("//*[@name='ic_room_pointGps']"));
            int index = Integer.parseInt(parametros[2]);
            rest.get(index).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='  ORDENAR DEL MENU']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Pasar a recoger']"))).click();
            Thread.sleep(5000);
            List<IOSElement> group =  driver.findElements(By.xpath("//*[@name='More Info']"));
            index = Integer.parseInt(parametros[3])-1;
            group.get(index).click();
            Thread.sleep(5000);
            List<IOSElement> prod = driver.findElements(By.xpath("//*[@XCElementType='XCUIElementTypeTextView']"));
            prod.get(0).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text=' e ir al menú']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ic keyboard backspace']"))).click();
            Thread.sleep(5000);
            group =  driver.findElements(By.xpath("//*[@name='More Info']"));
            index = Integer.parseInt(parametros[3]);
            group.get(index).click();
            Thread.sleep(5000);
            prod = driver.findElements(By.xpath("//*[@XCElementType='XCUIElementTypeTextView']"));
            prod.get(1).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text=' PAGAR COMPRA']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='   ORDENAR']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CONFIRMAR']"))).click();
            Thread.sleep(15000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='UIAButton' and ./parent::*[@text='Mi pedido']]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ic keyboard backspace']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//*[@class='UIATable' and ./parent::*[./parent::*[./parent::*[@class='UIAView']]]]/*[@class='UIAView'])[1]/*[@text='ic keyboard backspace'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//*[@class='UIATable' and (./preceding-sibling::* | ./following-sibling::*)[@text='  ORDENAR DEL MENU']]/*[@class='UIAView'])[1]/*[@text='ic keyboard backspace'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Restaurantes']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }
}
