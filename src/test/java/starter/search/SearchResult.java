package starter.search;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import static starter.search.ProductArticle.*;

public class SearchResult extends UIInteractionSteps {
    public void seeProductArticle(String title) {
        find(By.xpath(String.format(PRODUCT_LOCATOR, title))).waitUntilEnabled().click();
    }
}