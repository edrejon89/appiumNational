package iOS;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CP_25_RealizarPedidoUsandoCupon_IOS extends BaseTestIOS_Mac {
    @Test
    public void CP_25_RealizarPedidoUsandoCupon_IOSTest() {
        try {
            parametros = leerCSV("src/test/java/configuracion/CP25_Configuracion");





            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' correo@ejemplo.com']"))).sendKeys(parametros[0]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' **********']"))).sendKeys(parametros[1]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']"))).click();


            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text and @class='UIAButton']")));
            new TouchAction(driver).press(150,250).perform();
            Thread.sleep(5000);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text and @class='UIAButton']")));
            IOSElement promo = driver.findElement(By.xpath("//*[@text and @class='UIAButton']"));
            String tpay=promo.getText();
            if (tpay.equals(" ¡YA CUENTAS CON ESTA PROMOCIÓN!")){
                new TouchAction(driver).press(16,44).perform();
            }else {
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text=' AÑADIR A MIS PROMOCIONES']"))).click();
            }

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Lugares Cercanos']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Acepta: Efectivo' and (./preceding-sibling::* | ./following-sibling::*)[@text='PRUEBAS WALOOK']]"))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//*[@class='UIATable' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAImage']]/*[@class='UIAView'])[2]/*[@text='PRUEBAS WALOOK'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='  ORDENAR DEL MENU']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='UIAView' and ./parent::*[@class='UIAView' and ./parent::*[@class='UIAView' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAView' and ./*[@class='UIAView']] and ./parent::*[@class='UIAView']]]]/*/*[@text and @class='UIAButton'])[3]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='UIATable' and ./parent::*[./parent::*[./parent::*[@class='UIAView']]]]/*/*[@text='GrupoPostres'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='UIATable' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAImage']]/*/*[@text='NombreProducto'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text=' PAGAR COMPRA']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Añadir código de promoción']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aplicar']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='   ORDENAR']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CONFIRMAR']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='UIAButton' and ./parent::*[@text='Mi pedido']]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ic keyboard backspace']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//*[@class='UIATable' and ./parent::*[./parent::*[./parent::*[@class='UIAView']]]]/*[@class='UIAView'])[1]/*[@text='ic keyboard backspace'])[4]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//*[@class='UIATable' and (./preceding-sibling::* | ./following-sibling::*)[@text='  ORDENAR DEL MENU']]/*[@class='UIAView'])[1]/*[@text='ic keyboard backspace'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Restaurantes']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();

        } catch (Exception e) {
            Assert.fail(e.getMessage());        }
    }
}
