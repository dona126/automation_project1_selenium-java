package rough;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RoughClass {

//    WebDriver driver;
//
//    @BeforeClass
//    public void setup() {
//        // Setup ChromeDriver using WebDriverManager...refer POM file
//        //WebDriverManager.chromedriver().setup(); // auto-downloads and sets path
//        //OR
//        // Manually set the path to the chromedriver
//        System.setProperty("webdriver.chrome.driver", "C:/Users/donam/intellij_workplace/MyProject/src/test/resources/chromedriver.exe/");
//
//
//        driver = new ChromeDriver();   // now this works fine
//        driver.manage().window().maximize();
//    }
//
//    @Test
//    public void searchDogFood() {
//        // Open Tractor Supply website
//        driver.get("https://www.tractorsupply.com/");
//
//        // Close pop-up/modal if appears (may vary based on your location/cookies)
//        try {
//            Thread.sleep(3000); // Wait for modal
//            WebElement closePopup = driver.findElement(By.cssSelector("button[aria-label='Close']"));
//            closePopup.click();
//        } catch (Exception e) {
//            System.out.println("No pop-up appeared or could not close.");
//        }
//
//        // Locate the search box
//        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"sm-div\"]/div[1]/div/div[1]/div/input"));
//        searchBox.sendKeys("cat and dog food");
//    }
//
//    @AfterClass
//    public void teardown() {
//        // Close the browser
//        driver.quit();
//    }
}
