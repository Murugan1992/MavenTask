package org.junit;

import org.Task.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pojo.PojoTask;

import junit.framework.Assert;

public class JunitTask3 extends BaseClass {
	static PojoTask p;

	@Before
	public void bf() {
		launchBrowser();
		launchUrl("https://www.flipkart.com/account/login");
		maxWindow();
	}

	@Test
	public void flipLog() {
		Actions a = new Actions(driver);
		WebElement log = driver.findElement(By.xpath("(//input[@class='_2IX_2- VJZDxU'])"));
		toFillTextBox(log, "Murugan12");
		String u1 = toGetValue(log);
		Assert.assertEquals("Check user name", "Murugan12", u1);

		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])"));
		toFillTextBox(pass, "Log@12345");
		String p1 = toGetValue(pass);
		Assert.assertEquals("Chek the Password", "Log@12345", p1);
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnClick(submit);
	}

}
