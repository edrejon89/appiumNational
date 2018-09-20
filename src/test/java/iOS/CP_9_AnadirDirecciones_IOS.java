package iOS;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class CP_9_AnadirDirecciones_IOS extends BaseTestIOS_Win{
        //requiere que al iniciar la prueba se minimicen todas las ventanas abiertas para que la ventana del sincronizador se encuentre a la vista

    @Test
    public void CP_9_AnadirDirecciones_IOSTest(){
        try {
                Thread.sleep(15000);
                parametros = leerCSV("src/test/java/configuracion/CP9_Configuracion");

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
                Thread.sleep(6000);
                driver.findElement(By.xpath("//*[@text='Ingresar']"));
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Ingresar']"))).click();

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' correo@ejemplo.com']"))).sendKeys(parametros[0]);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder=' **********']"))).sendKeys(parametros[1]);
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='INICIAR SESIÓN']"))).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();


                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Mis direcciones']"))).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Direcciones']/*[@class='UIAButton' and @width>0])[2]"))).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Identificador (Ej. Casa, Oficina)']"))).sendKeys(parametros[2]+" "+parametros[12] );

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Calle']"))).click();
                //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='more, numbers']"))).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Calle']"))).sendKeys(parametros[3]);

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Número Ext.']"))).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Número Ext.']"))).sendKeys(parametros[4]);

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Número Int.']"))).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Número Int.']"))).sendKeys(parametros[5]);

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Cruzamientos']"))).click();
                //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='more, numbers']"))).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Cruzamientos']"))).sendKeys(parametros[6]);

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='C.P.']"))).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='C.P.']"))).sendKeys(parametros[7]);

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Referencias']"))).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Referencias']"))).sendKeys(parametros[11]);

                driver.hideKeyboard();

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='GUARDAR']"))).click();

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

    }
}
