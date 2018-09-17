package iOS;
//package <set your test package>;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.junit.*;

public class CP_3_CreacionCuentaFB_Mac extends BaseTestIOS_Mac {
    //La prueba requiere que el navegador tenga iniciada la sesion de facebook
     @Test
    public void testUntitled() {


        try {
            Thread.sleep(15000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Crear cuenta']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Continue with Facebook']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Continuar']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='OMITIR']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='OMITIR']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }


}