package iOS;

import org.openqa.selenium.By;

public class CP_5_IniciarSesion_IOS extends BaseTestIOS_Win {

    public void iniciarSesion(){
        driver.findElement(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]")).click();
        driver.findElement(By.xpath("//*[@text='Ingresar']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder=' correo@ejemplo.com']")));
        driver.findElement(By.xpath("//*[@placeholder=' correo@ejemplo.com']")).sendKeys("walook.pruebas@gmail.com");
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder=' **********']")));
        driver.findElement(By.xpath("//*[@placeholder=' **********']")).sendKeys("Admin123");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='INICIAR SESIÓN']")));
        driver.findElement(By.xpath("//*[@text='INICIAR SESIÓN']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]")));
        driver.findElement(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]")).click();
        driver.findElement(By.xpath("//*[@text='Cerrar sesión']")).click();
        driver.findElement(By.xpath("//*[@text='Aceptar']")).click();

    }
}
