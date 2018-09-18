package iOS;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_1_CreacionDeCuenta_IOS extends BaseTestIOS_Win {
    
    @Test
    public void creacionCuenta(){
        try {
            parametros = leerCSV("src/test/java/configuracion/CP1_Configuracion");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Crear cuenta']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Nombre']"))).sendKeys(parametros[0]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Apellido']"))).sendKeys(parametros[1]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Correo']"))).sendKeys(parametros[2]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='O ingresa tus datos']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Contraseña']"))).sendKeys(parametros[3]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='O ingresa tus datos']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Images/Bg1Restaurant2.jpg']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Images/Bg1Restaurant2.jpg']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Confirmar Contraseña']"))).sendKeys(parametros[3]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='O ingresa tus datos']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CREAR CUENTA']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='OMITIR']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='OMITIR']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='OMITIR']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }
}
