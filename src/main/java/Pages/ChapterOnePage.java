package Pages;

import Utils.BasePage;
import Utils.WebdriverControl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ChapterOnePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(), 'Home Page')]")
    private WebElement homePageLink;

    @FindBy(xpath = "//*[@id = 'divontheleft']")
    private WebElement textIsOnPage;



    public String textOnChapterOnePage() {
        return textIsOnPage.getText();
    }

    public LandingPage clickHomePage() {
        WebDriverWait wait = new WebDriverWait(WebdriverControl.driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(homePageLink));
        homePageLink.click();
        return new LandingPage();
    }

}