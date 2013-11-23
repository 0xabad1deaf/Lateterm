import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;
import com.saucelabs.junit.SauceOnDemandTestWatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;




import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.saucelabs.common.Utils;

public class ITWebDriver implements SauceOnDemandSessionIdProvider {

    public SauceOnDemandAuthentication authentication = new SauceOnDemandAuthentication(
                "joiblumen", "19374220-fef6-4897-8922-fa92f7142053");

    /**
     * JUnit Rule that marks the Sauce Job as passed/failed when the test succeeds or fails.
     * You can see the pass/fail status on your [Sauce Labs test page](https://saucelabs.com/tests).
     */
    public @Rule
    SauceOnDemandTestWatcher resultReportingTestWatcher = new SauceOnDemandTestWatcher(this, authentication);

    /**
     * JUnit Rule that will record the test name of the current test. This is referenced when creating the 
     * {@link DesiredCapabilities}, so the Sauce Job is created with the test name.
     */
    public @Rule TestName testName = new TestName();

    private WebDriver driver;

    private String sessionId;

    @Before
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("version", "25");
        capabilities.setCapability("platform", Platform.WIN8);
        capabilities.setCapability("name",testName.getMethodName());        
        capabilities.setCapability("tunnel-identifier",Utils.readPropertyOrEnv("TRAVIS_JOB_NUMBER",""));
        this.driver = new RemoteWebDriver(
                new URL("http://" + authentication.getUsername() + ":" + authentication.getAccessKey() + "@ondemand.saucelabs.com:80/wd/hub"), capabilities);
        this.sessionId = ((RemoteWebDriver)driver).getSessionId().toString();
    }

    @Override
    public String getSessionId() {
        return sessionId;
    }
    
    @Test
    public void CheckTitleName() throws Exception {
        driver.get("http://localhost:4567");
        assertEquals("Tic Tac Toes!",driver.getTitle());
    }

    @Test
    public void CheckPlayNowButton() throws Exception {
        driver.get("http://localhost:4567");
        driver.findElement(By.xpath("html/body/div[2]/a/button")).click();
        assertEquals(driver.getCurrentUrl(), "http://localhost:4567/game.html");
    }

    @Test
    public void CheckPlayerVsComputerButton() throws Exception {
         driver.get("http://localhost:4567/game.html");
         driver.findElement(By.id("btn1")).click();
         assertEquals(driver.findElement(By.className("main-game")).isDisplayed(), true);
    }

    @Test
    public void CheckCheckgetsPlacedWhenPlacingCheck() throws Exception {
         driver.get("http://localhost:4567/game.html");
         driver.findElement(By.id("btn1")).click();
         (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
             public Boolean apply(WebDriver d) {
                 return driver.findElement(By.className("main-game")).isDisplayed();
             }
         });
         driver.findElement(By.id("box11")).click();
         (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
             public Boolean apply(WebDriver d) {
                 return driver.findElement(By.className("fa-check")).isDisplayed();
             }
         });
    }

    @Test 
    public void CheckPlayerVsPlayerButton() throws Exception {
         driver.get("http://localhost:4567/game.html");
         driver.findElement(By.id("btn2")).click();
         assertEquals(driver.findElement(By.className("main-game")).isDisplayed(), true);
    }

    @Test
    public void CheckResultBox() throws Exception {
         driver.get("http://localhost:4567/game.html");
         driver.findElement(By.id("btn2")).click();
         driver.findElement(By.id("box00")).click();
         driver.findElement(By.id("box20")).click();
         driver.findElement(By.id("box01")).click();
         driver.findElement(By.id("box10")).click();
         driver.findElement(By.id("box02")).click();
         assertEquals(driver.findElement(By.id("result-box")).isDisplayed(), true);
    }
    
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
