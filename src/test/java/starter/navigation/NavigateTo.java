package starter.navigation;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class NavigateTo {

    DemoShopHomePage homePage;

    @Step("Open the Prestashop home page")
    public void theHomePage() {
        homePage.open();
    }
}