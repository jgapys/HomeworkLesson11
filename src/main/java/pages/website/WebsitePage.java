package pages.website;

import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class WebsitePage extends BasePage {
    public WebsitePage(WebDriver driver) {
        super(driver);
    }

    public String getWebsiteTitle() {
        return driver.getTitle();
    }
}
