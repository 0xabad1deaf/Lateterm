package is.abadidea.tictactoe;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import static junit.framework.Assert.assertTrue;

public class firefoxTest
{
	@Test
	public void CheckTitleName(){
		WebDriver driver = new HtmlUnitDriver(); // a headless driver
		driver.get("http://tictactoes.co.vu/index.html");

		assertTrue(driver.getTitle().startsWith("Tic Tac Toes!"));
	}

	@Test
	public void firefoxIsSupportedByWebdriver(){
		WebDriver driver = new FirefoxDriver();

		driver.get("http://tictactoes.co.vu/index.html");
		assertTrue(driver.getTitle().startsWith("Tic Tac Toes!"));
		//driver.findElement(By.id("playnow!")).click();
		driver.close();
	}

	/*private boolean isElementPresent(By by) {	//function for checking whether element is there
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
  	}*/
}