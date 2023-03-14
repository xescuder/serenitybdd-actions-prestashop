package starter.interactions;

import net.serenitybdd.core.annotations.findby.By;
import starter.pages.HomePage;

public class NavigateTo {
    HomePage homePage;

    public void theHomePage() {
        homePage.open();
        // Accept cookies
        homePage.find(By.id("iqitcookielaw-accept")).click();
    }
}