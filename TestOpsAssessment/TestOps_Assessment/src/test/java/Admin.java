
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public class Admin {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver();

        // Navigate to the website
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Maximize page
        driver.manage().window().maximize();

        // page to wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
