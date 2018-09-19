package iOS;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//*[@class='UIATable' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAImage']]/*[@class='UIAView'])[2]/*[@text='PRUEBAS WALOOK'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='  ORDENAR DEL MENU']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Pasar a recoger']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='UIATable' and ./parent::*[./parent::*[./parent::*[@class='UIAView']]]]/*/*[@text='GrupoPostres'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='UIATable' and (./preceding-sibling::* | ./following-sibling::*)[@class='UIAImage']]/*/*[@text='NombreProducto'])[1]"))).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text=' e ir al menú']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ic keyboard backspace']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='UIATable' and (./preceding-sibling::* | ./following-sibling::*)[@text='        [ 1 ]']]/*/*[@text='GrupoPostres'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Flan']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text=' PAGAR COMPRA']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='   ORDENAR']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CONFIRMAR']"))).click();
            Thread.sleep(15000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='UIAButton' and ./parent::*[@text='Mi pedido']]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ic keyboard backspace']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//*[@class='UIATable' and ./parent::*[./parent::*[./parent::*[@class='UIAView']]]]/*[@class='UIAView'])[1]/*[@text='ic keyboard backspace'])[4]"))).click();
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