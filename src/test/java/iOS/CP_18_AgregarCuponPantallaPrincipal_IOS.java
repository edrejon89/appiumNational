package iOS;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

public class CP_18_AgregarCuponPantallaPrincipal_IOS extends BaseTestIOS_Mac {


    @Test
    public void CP_18_AgregarCuponPantallaPrincipal_IOSTest(){
        try {
            parametros = leerCSV("src/test/java/configuracion/CP18_Configuracion");


            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' correo@ejemplo.com']"))).sendKeys(parametros[0]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' **********']"))).sendKeys(parametros[1]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']"))).click();


            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text and @class='UIAButton']")));
            Thread.sleep(12000);
            new TouchAction(driver).press(150,250).perform();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text and @class='UIAButton']")));
            IOSElement promo = driver.findElement(By.xpath("//*[@text and @class='UIAButton']"));
            String tpay=promo.getText();
            if (tpay.equals(" ¡YA CUENTAS CON ESTA PROMOCIÓN!")){
                new TouchAction(driver).press(16,44).perform();
            }else {
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text=' AÑADIR A MIS PROMOCIONES']"))).click();
            }
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }


}
