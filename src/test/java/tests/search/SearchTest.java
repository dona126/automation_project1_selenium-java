package tests.search;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class SearchTest extends BaseTest {
    @Test
    public void testSearchFunctionality() {
        HomePage homePage = new HomePage(driver);
        homePage.enterSearchText("Selenium WebDriver");
        System.out.println("Search test executed!!!!!!!!!!!!!!!");
    }
}
