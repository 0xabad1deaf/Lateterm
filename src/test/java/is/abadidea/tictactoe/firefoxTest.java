package is.abadidea.tictactoe;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static junit.framework.Assert.assertTrue;

public class firefoxTest
{
	@Test
	public void driverTest(){
		WebDriver driver = new HtmlUnitDriver(); // a headless driver
		driver.get("http://tictactoes.co.vu/index.html");

		assertTrue(driver.getTitle().startsWith("Tic Tac Toes!"));
	}



}