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

import java.net.URL;

import static org.junit.Assert.assertEquals;
import com.saucelabs.common.Utils;

/**
 * Simple {@link RemoteWebDriver} test that demonstrates how to run your Selenium tests with <a href="http://saucelabs.com/ondemand">Sauce OnDemand</a>.
 * *
 * @author Ross Rowe
 */
public class WebDriverTest {

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
        driver.get("127.0.0.1:60040");
        assertEquals("Tic Tac Toes!",driver.getTitle());
    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
