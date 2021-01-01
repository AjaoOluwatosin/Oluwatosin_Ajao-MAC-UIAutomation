package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By username = By.id("username");

    public void enterUsername(String uName) {
        driver.findElement(username).sendKeys(uName);
    }

    public void enterUserPassword(String pad) {
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(pad);
    }

    public DashboardPage clickLoginBtn() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
        return new DashboardPage(driver);
    }
}
