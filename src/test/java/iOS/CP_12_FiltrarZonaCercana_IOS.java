package iOS;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CP_12_FiltrarZonaCercana_IOS extends BaseTestIOS_Win {

    @Test
    public void filtrarZonaCercana(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Lugares Cercanos']"))).click();

    }
}
