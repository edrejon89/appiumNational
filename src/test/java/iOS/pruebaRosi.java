package iOS;

//package <set your test package>;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class pruebaRosi extends BaseTestIOS_Win{

    @Test
    public void testUntitled() throws InterruptedException {
        Thread.sleep(8000);
        driver.findElement(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[1]")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Ingresar']")));
        driver.findElement(By.xpath("//*[@text='Ingresar']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@placeholder=' correo@ejemplo.com']")).sendKeys("rosi@gamils.com");
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder=' **********']")));
        driver.findElement(By.xpath("//*[@placeholder=' **********']")).sendKeys("Admin123");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='INICIAR SESIÓN']")));
        driver.findElement(By.xpath("//*[@text='INICIAR SESIÓN']")).click();
        driver.findElement(By.xpath("//*[@text='Aceptar']")).click();
        driver.findElement(By.xpath("//*[@text='CANCELAR']")).click();

    }

}