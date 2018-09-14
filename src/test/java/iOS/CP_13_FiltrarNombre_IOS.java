package iOS;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_13_FiltrarNombre_IOS extends BaseTestIOS_Win {
    @Test
    public void filtrarNombre(){
        try {
            String[] parametros = leerCSV("src/test/java/configuracion/CP13_Configuracion");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='Categorias']/*[@class='UIAButton'])[2]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Restaurante...']"))).sendKeys(parametros[0]);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Buscar']"))).click();
            Thread.sleep(6000);
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }
}
