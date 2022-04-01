package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgTask6 {
	WebDriver driver;
	@Parameters ({"browser"})
	@Test
	private void tc1(String browserName) {
if (browserName.contains("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}else {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
}driver.get("http://www.greenstechnologys.com/");
	}
	
}

