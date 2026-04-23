package kontrel.playwright.java.test.automation.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class DashboardPage {
  
  private Locator dashboardButton;

  public DashboardPage(Page page) {
    dashboardButton = page.locator("id=nav-dashboard");
  }

  public Locator dashboardButton() {
    return dashboardButton;
  }
}
