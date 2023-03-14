package starter.interactions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.Keys;
import starter.pages.SearchForm;

public class SearchFor extends UIInteractionSteps {
    public void term(String term) {
        $(SearchForm.SEARCH_FIELD).waitUntilEnabled().clear();
        $(SearchForm.SEARCH_FIELD).sendKeys(term, Keys.ENTER);
    }
}
