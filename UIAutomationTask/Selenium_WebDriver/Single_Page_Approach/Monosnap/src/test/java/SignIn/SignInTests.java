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
        driver.get("https://monosnap.com/");

        //Wait for 5 seconds
        Thread.sleep(5000);
        //Maximise the window
        driver.manage().window().maximize();

        //fetch page title
        System.out.println(driver.getTitle());

        //Wait till page is fully loaded
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //click accept cookies
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[3]/div[2]")).click();

        //click on the signin button on the homepage
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[3]")).click();

        //locate email field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[6]/input[1]")).sendKeys("ajaotj36@gmail.com");

        //locate password field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[6]/input[2]")).sendKeys("victoria2077@@@");

        //locate button field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();

    }

    public static void main(String args[]) throws InterruptedException {
        SignInTests test = new SignInTests();
        test.setUp ();
    }

    //close browser
    @AfterClass
    public void closeBrowser () throws InterruptedException{
        Thread.sleep(5000);
        driver.quit();
    }


    }





