package Pages;

import Utils.BasePage;
import Utils.WebdriverControl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LandingPage extends BasePage {

    @FindBy(xpath = "//a[@href = \"/chapter1\"]")
    private WebElement chapter1Link;

    @FindBy(className = "mainbody")
    private WebElement landingText;



    public ChapterOnePage clickOnChapterOneLink() {
        WebDriverWait wait = new WebDriverWait(WebdriverControl.driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(chapter1Link));
        chapter1Link.click();
        return new ChapterOnePage();
    }

    public String textFromLandingPage() {
        WebDriverWait wait = new WebDriverWait(WebdriverControl.driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(chapter1Link));
        return landingText.getText();
    }

}