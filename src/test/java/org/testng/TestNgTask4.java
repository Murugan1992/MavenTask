package org.testng;
import java.util.Date;
import org.Task.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pojo.PojoTask;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import junit.framework.Assert;
public class TestNgTask4 extends BaseClass {
	@BeforeClass
	private void bfCls() {
		System.out.println("Before Class Starterd");
	}
	@AfterClass
	private void aftCls() {
		System.out.println("After Class End");
	}
	@BeforeMethod
	private void bfMtd() {
		Date d = new Date();
		System.out.println(d);
		launchBrowser();
		launchUrl("https://www.flipkart.com/account/login");
	}
	@AfterMethod
	private void aftMtd() {
		Date d = new Date();
		System.out.println(d);
		toClose();
	}
	@Test
	private void title() {
		String title = toGetTitle();
		System.out.println("Title:" + title);
	}
	@Test
	private void toFetchUrl() {
		String url = toGetUrl();
		System.out.println("Url:" + url);
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
		Assert.assertEquals("Chek the Password", "Log@1234", p1);
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btnClick(submit);
}}




