package Utils;

import org.openqa.selenium.support.PageFactory;

public class BasePage extends PageFactory {

    public BasePage() {
        initElements(WebdriverControl.driver, this);
    }

}