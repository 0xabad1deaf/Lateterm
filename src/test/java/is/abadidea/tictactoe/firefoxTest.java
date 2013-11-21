package is.abadidea.tictactoe;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class firefoxTest.java {

  public static void main(String[] args){

    WebDriver driver = new FirefoxDriver();

    driver.get("http://tictactoes.co.vu/index.html");
    System.out.println("Page title is: " + driver.getTitle());
    driver.quit();
  }








  /*private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = System.getenv("STAGING_SERVER");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void titleShouldBeTicTacToes() throws Exception {
    driver.get(baseUrl);
    assertEquals("Tic Tac Toes!", driver.getTitle());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }*/

}