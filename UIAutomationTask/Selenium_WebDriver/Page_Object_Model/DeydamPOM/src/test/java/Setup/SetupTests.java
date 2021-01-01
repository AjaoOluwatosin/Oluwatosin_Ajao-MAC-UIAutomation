package Setup;

import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetupTests {
    private WebDriver driver;
    protected LoginPage loginpage;

    @BeforeTest
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromeDriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        loginpage = new LoginPage(driver);
    }

    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }


}
