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
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Crear cuenta']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Crear cuenta']"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Continue with Facebook']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Continue with Facebook']"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Continuar']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Continuar']"))).click();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder='Fecha de Nacimiento']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Fecha de Nacimiento']"))).click();
            new TouchAction(driver).press(574, 750).moveTo(586, 1025).release().perform();
            new TouchAction(driver).press(574, 750).moveTo(586, 1025).release().perform();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='1987']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ic check circle']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Género']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='- Tu genero -']"))).click();
            new TouchAction(driver).press(574, 750).moveTo(586, 650).release().perform();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Femenino']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ic check circle']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Móvil']"))).sendKeys("9999999999");
            driver.hideKeyboard();
            Thread.sleep(2000);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='GUARDAR']"))).click();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }


}