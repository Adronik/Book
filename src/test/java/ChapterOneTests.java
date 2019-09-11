import Pages.ChapterOnePage;
import Pages.LandingPage;
import Utils.BrowserNavigation;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class ChapterOneTests {

    @Test
    public void textPresenceOnThePage() {
        LandingPage landingPage = BrowserNavigation.openLanding();
        ChapterOnePage chapterOnePage = landingPage.clickOnChapterOneLink();
        assertEquals(chapterOnePage.textOnChapterOnePage(), "Assert that this text is on the page");
        chapterOnePage.clickHomePage();
        landingPage.textFromLandingPage();
        assertEquals(landingPage.textFromLandingPage(), "Below is a list of links to the examples needed in the chapters. Click on the links below and follow the steps in the book.\n" +
                "Chapter1\n" +
                "Chapter2\n" +
                "Chapter3\n" +
                "Chapter4\n" +
                "Chapter8");
    }

}