package kontrel.playwright.java.test.automation.pages;

import com.microsoft.playwright.*;

public class LoginPage {

  private Locator usernameInput;
  private Locator passwordInput;
  private Locator loginButton;
  
  public LoginPage(Page page) {
    usernameInput = page.locator("id=username");
    passwordInput = page.locator("id=password");
    loginButton = page.locator("id=login-btn");
  }
  
  public void adminLogin() {
    usernameInput.fill("admin");
    passwordInput.fill("admin123");
    loginButton.click();
  }

  public void viewerLogin() {
    usernameInput.fill("viewer");
    passwordInput.fill("viewer123");
    loginButton.click();
  }
}
