package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    private WebDriver driver;

    @BeforeClass
    public void setUp()throws InterruptedException {
        //Import ChromeDriver
        System.setProperty("webDriver.chromedriver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        //Import the webpage URL
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");

        //Wait for 5 seconds
        Thread.sleep(5000);

        //Maximise the window
        driver.manage().window().maximize();

        //Wait till page is fully loaded
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    private void printTitle(){
        System.out.println(driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("Culjosh");
        driver.findElement(By.id("password")).sendKeys("victoria2077");

    }

    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp ();
    }

    @AfterClass
    public void closeBrowser () throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }




















    }
