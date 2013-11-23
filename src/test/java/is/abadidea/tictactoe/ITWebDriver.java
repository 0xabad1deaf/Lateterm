import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.common.SauceOnDemandSessionIdProvider;
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



import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.saucelabs.common.Utils;

/**
 * Simple {@link RemoteWebDriver} test that demonstrates how to run your Selenium tests with <a href="http://saucelabs.com/ondemand">Sauce OnDemand</a>.
 * *
 * @author Ross Rowe
 */
public class ITWebDriver {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("version", "25");
        capabilities.setCapability("platform", Platform.WIN8);
        capabilities.setCapability("tunnel-identifier",Utils.readPropertyOrEnv("TRAVIS_JOB_NUMBER",""));
        this.driver = new RemoteWebDriver(
                new URL("http://joiblumen:19374220-fef6-4897-8922-fa92f7142053@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
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

    /*@Test
    public void CheckGrid00() throws Exception {
        driver.get("http://localhost:4567/game.html");
        driver.findElement(By.xpath("html/body/div[3]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("html/body/div[3]/table/tbody/tr[1]/td[1]")).click();

        WebElement a = driver.findElement(By.xpath("html/body/div[3]/table/tbody/tr[1]/td[1]/i"));


        //driver.findElement(By.id("box00")).click();
        //WebElement  i = driver.findElement(By.cssSelector("#box00 fa fa-5x"));
        WebElement  i = driver.findElement(By.cssSelector("@class fa fa-5x fa-check"));
        assertTrue(i.isEnabled());
    }*/


    @Test
    public void CheckPlayerVsComputerButton() throws Exception {
         driver.get("http://localhost:4567/game.html");
         driver.findElement(By.id("btn1")).click();
         assertEquals(driver.findElement(By.className("main-game")).isDisplayed(), true);
         driver.close();
    }

    @Test 
    public void  CheckPlayerVsPlayerButton() throws Exception {
         driver.get("http://localhost:4567/game.html");
         driver.findElement(By.id("btn2")).click();
         assertEquals(driver.findElement(By.className("main-game")).isDisplayed(), true);
         driver.close();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
