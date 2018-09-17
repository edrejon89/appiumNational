package iOS;

import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_20_RealizarPedidoSesionIniciada_IOS extends BaseTestIOS_Mac{
    @Test
    public void CP_20_RealizarPedidoSesionIniciada_IOSTest(){

        try {
        parametros=leerCSV("src/test/java/configuracion/CP20_Configuracion");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' correo@ejemplo.com']"))).sendKeys(parametros[0]);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder=' **********']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' **********']"))).sendKeys(parametros[1]);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Vegetariana' and @class='UIAStaticText' and ./parent::*[@class='UIAView']]")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Vegetariana' and @class='UIAStaticText' and ./parent::*[@class='UIAView']]"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Fast Food, Bar, Pizzas, Hamburguesas, Ensaladas']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Fast Food, Bar, Pizzas, Hamburguesas, Ensaladas']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='  ORDENAR DEL MENU']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='  ORDENAR DEL MENU']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Pasar a recoger']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='LUNCH $95']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='LUNCH $95']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='1/2 BAGUETTE' and @class='UIAStaticText']"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text=' PAGAR COMPRA']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text=' PAGAR COMPRA']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='   ORDENAR']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CONFIRMAR']"))).click();
        Thread.sleep(20000);//Espera para evitar que se haga clic sobre la notificación de correo electrónico
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='UIAButton' and ./parent::*[@text='Mi pedido']]")));
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
