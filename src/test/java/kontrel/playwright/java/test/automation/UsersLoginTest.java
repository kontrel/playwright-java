package kontrel.playwright.java.test.automation;

import org.junit.jupiter.api.Test;

import kontrel.playwright.java.test.automation.pages.DashboardPage;
import kontrel.playwright.java.test.automation.pages.LoginPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class UsersLoginTest extends BaseTest {

  @Test
  void adminLoginTest() {

    LoginPage loginPage = new LoginPage(page);
    DashboardPage dashboardPage = new DashboardPage(page);

    loginPage.adminLogin();
    assertThat(dashboardPage.dashboardButton()).isVisible();;
  }

  @Test
  void viewerLoginTest() {

    LoginPage loginPage = new LoginPage(page);
    DashboardPage dashboardPage = new DashboardPage(page);

    loginPage.adminLogin();
    assertThat(dashboardPage.dashboardButton()).isVisible();;
  }

}
