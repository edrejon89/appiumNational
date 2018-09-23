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
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='/var/mobile/Containers/Data/Application/786B2505-A5DF-41FF-8A0C-CBDD00D266BA/Documents/"+parametros[2]+".jpg']"))).click();
//            Thread.sleep(5000);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text and @class='UIAButton']")));
            IOSElement promo = driver.findElement(By.xpath("//*[@text and @class='UIAButton']"));
            String tpay=promo.getText();
//            Assert.fail(tpay);
            if (tpay.equals(" ¡YA CUENTAS CON ESTA PROMOCIÓN!")){
    //                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='UIAButton' and ./parent::*[@text='prueba de promocion']]"))).click();
                new TouchAction(driver).press(16,44).perform();
            }else {
//                Assert.fail(tpay);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text=' AÑADIR A MIS PROMOCIONES']"))).click();
//                Thread.sleep(15000);
//                IOSElement yacuenta = driver.findElement(By.xpath("(((//*[@class='UIAView' and ./parent::*[@class='UIAView']]/*[@class='UIAView'])[13]/*/*[@class='UIAView' and ./parent::*[@class='UIAView']])[1]/*[@text and @class='UIAStaticText'])[1]"));
//                if (yacuenta.isDisplayed()){
//                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();
//                }
    //                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='UIAButton' and ./parent::*[@text='prueba de promocion']]"))).click();
//                new TouchAction(driver).press(16,44).perform();
            }
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }


}
