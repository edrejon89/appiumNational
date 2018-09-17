package iOS;

import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CP_19_AgregarCuponEnRestaurante_IOS extends BaseTestIOS_Win {

    @Test
    public void agregarCuponEnRestaurante(){
        try {
            String[] parametros = leerCSV("src/test/java/configuracion/CP19_Configuracion");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' correo@ejemplo.com']"))).sendKeys(parametros[0]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' **********']"))).sendKeys(parametros[1]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Restaurante...']"))).sendKeys(parametros[4]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Buscar']"))).click();
            String restaurant = "//*[@id='" + parametros[4] + "']";
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(restaurant))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='  ORDENAR DEL MENU']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ver las promociones']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Detalles']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@knownSuperClass='UIButton']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@knownSuperClass='_UIButtonBarButton']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ic keyboard backspace']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ic keyboard backspace']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@knownSuperClass='_UIButtonBarButton']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }
}
