package kontrel.playwright.java.test.automation;

import org.junit.jupiter.api.*;
import com.microsoft.playwright.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseTest {
  
  protected Playwright playwright;
  protected Browser browser;
  protected BrowserContext context;
  protected Page page;

  @BeforeAll
  void globalSetup() {
    playwright = Playwright.create();
    browser = playwright.chromium().launch(
      new BrowserType.LaunchOptions().setHeadless(false)
    );
  }

  @BeforeEach
  void setup() {
    context = browser.newContext(
      new Browser.NewContextOptions()
        .setViewportSize(1280, 720)
        .setIgnoreHTTPSErrors(true)
    );

    page = context.newPage();
  } 

  @AfterEach
  void teardown() {
    if (context != null) context.close();
  }

  @AfterAll
  void globalTeardown() {
    if (browser != null) browser.close();
    if (playwright != null) playwright.close();
  }

}
    