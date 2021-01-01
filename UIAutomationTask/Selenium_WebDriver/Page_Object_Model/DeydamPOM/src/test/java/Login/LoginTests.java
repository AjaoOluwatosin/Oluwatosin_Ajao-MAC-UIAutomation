package Login;

import PageObjects.DashboardPage;
import Setup.SetupTests;
import org.testng.annotations.Test;

public class LoginTests extends SetupTests {
    @Test
    public void testLogin() throws InterruptedException
    {
        String username = "Culjosh2077";
        loginpage.enterUsername(username);
        loginpage.enterUserPassword("victoria2077");

        DashboardPage dashboardPage = loginpage.clickLoginBtn();
        dashboardPage.clickfaviedee();
        loginpage = dashboardPage.clickLogout();
    }

}
