package iOS;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class CP_8_IniciarSesionFb_IOS extends BaseTestIOS_Mac{
   @Test
    public void CP_8_IniciarSesionFb_IOSTest(){

       try {
           Thread.sleep(15000);
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Continue with Facebook']"))).click();
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Continuar']"))).click();
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();
       } catch (Exception e) {
           Assert.fail(e.getMessage());
       }
   }
}
