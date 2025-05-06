package pages;

import org.openqa.selenium.*;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchBox = By.name("q"); // Example: Google search box

    public void enterSearchText(String text) {
        WebElement searchInput = driver.findElement(searchBox);
        searchInput.clear();
        searchInput.sendKeys(text);
        searchInput.submit();
    }
}
