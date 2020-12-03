package SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignInTests {
    private WebDriver driver;

    @BeforeClass
    public void setUp()throws InterruptedException {
        //Import ChromeDriver
        System.setProperty("webDriver.chromedriver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        //Import the webpage URL
        driver.get("https://www.facebook.com/?stype=lo&jlou=AffWZLjCLPB_itpVetGyG1K5ZE600iNDCcZRfA5zeeZx5WZF2669jUkY5pYcVn_bB3di9rtEx7hocJjmoRRler1O0PeSoCetec5nzxOMX3tqXA&smuh=2991&lh=Ac9qqbEW_gZ3lDhp4eo");

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
        driver.findElement(By.id("email")).sendKeys("ajaooluwatosin@rocketmail.com");
        driver.findElement(By.id("pass")).sendKeys("ajaotj36");

    }

    public static void main(String args[]) throws InterruptedException {
        SignInTests test = new SignInTests();
        test.setUp ();
    }

    @AfterClass
    public void closeBrowser () throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }


}
