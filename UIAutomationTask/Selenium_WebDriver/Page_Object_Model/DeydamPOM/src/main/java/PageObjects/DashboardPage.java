package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By Culjosh2077 = By.xpath("/html/body/div/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/button/p");
    private By LogOut = By.xpath("/html/body/div/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/div/div/a[3]/p");

    public void clickfaviedee() throws InterruptedException
    {
        Thread.sleep(10000);
        driver.findElement(Culjosh2077).click();
    }

    public LoginPage clickLogout() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.findElement(LogOut).click();
        return new LoginPage(driver);
    }
}
