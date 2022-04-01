package org.testng;

import org.Task.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgTask7 extends BaseClass {
	WebDriver driver;
	@Parameters ({"browser"})
	@Test
	private void tc1(String browserName) {
if (browserName.contains("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	WebElement log = driver.findElement(By.xpath("(//input[@class='_2IX_2- VJZDxU'])"));
	toFillTextBox(log, "Murugan12");
	
	}else {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
}driver.get("https://www.flipkart.com/account/login");
	}
	


}
