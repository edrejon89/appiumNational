package iOS;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_14_FiltraraPorCategoria_IOS extends BaseTestIOS_Win {
    @Test
    public void filtrarCategoria(){
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Arabe']"))).click();
            Thread.sleep(6000);
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }
}
