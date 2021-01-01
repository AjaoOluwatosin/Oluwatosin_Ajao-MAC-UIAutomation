package login;

import Setup.SetupTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;

public class LoginTests extends SetupTests {
    @Test
    //this class extends to the SetupTests
    public void testLogin() throws InterruptedException {

        Thread.sleep(1000);
        String username = "Admin";
        loginPage.enterUsername(username);
        loginPage.enterUserPassword("admin123");


//handler for dashboard page

        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.clickWelcomeAdmin();
        loginPage = dashboardPage.clickLogout();

    }




}
