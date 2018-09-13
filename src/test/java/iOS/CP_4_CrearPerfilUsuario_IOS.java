package iOS;

import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_4_CrearPerfilUsuario_IOS extends BaseTestIOS_Win {
    @Test
    public void crearPerfilUsuario(){
        try {

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Crear cuenta']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Sign in']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("Continue"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class = 'UIAImage']"))).click();/*
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@accessibilityLabel='/var/mobile/Containers/Data/Application/D8755B57-C7A3-4837-93F2-C7F0E5DE2213/Documents/Profile.jpg']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Seleccionar de Galería']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='UIATable']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='UIATable']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Images/IconUser.png']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Tomar de Cámara']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Tomar de Cámara']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cancel']"))).click();*/
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Fecha de Nacimiento']"))).click();
            new TouchAction(driver).press(574, 750).moveTo(586, 1025).release().perform();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ic check circle']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Género']"))).click();
            new TouchAction(driver).press(610, 1041).moveTo(578, 832).release().perform();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ic check circle']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Móvil']"))).sendKeys("999999999");
            driver.hideKeyboard();
            driver.hideKeyboard();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='GUARDAR']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='OMITIR']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cerrar sesión']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Aceptar']"))).click();

        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }
}
