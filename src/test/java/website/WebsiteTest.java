package website;

import base.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.website.WebsitePage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebsiteTest extends TestBase {
    private static final Logger logger = LoggerFactory.getLogger(WebsiteTest.class);

    @Test
    @DisplayName("Checking title")
    void checkWebsiteTitle() {
        WebsitePage websitePage = new WebsitePage(driver);
        logger.info(">>>> Start test >>>>>");
        String websiteTitle = websitePage.getWebsiteTitle();
        logger.info("Website title: {}", websiteTitle);
        logger.info("Expected title: {}", System.getProperty("title"));
        assertThat(websiteTitle).isEqualTo(System.getProperty("title"));
    }
}
