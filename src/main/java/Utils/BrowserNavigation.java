package Utils;

import Pages.LandingPage;

public class BrowserNavigation {

    public static LandingPage openLanding() {

        WebdriverControl.driver.get("http://book.theautomatedtester.co.uk/");
        return new LandingPage();

    }

}