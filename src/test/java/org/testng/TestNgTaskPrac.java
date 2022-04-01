package org.testng;

import org.Task.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pojo.PojoTask;
import org.testng.annotations.Test;

public class TestNgTaskPrac extends BaseClass {
	@Test
	private void login() {
	launchBrowser();
	launchUrl("https://www.redbus.in/");
	//maxWindow();
	PojoTask p = new PojoTask();
	//Actions a = new Actions(driver);
	//WebElement log = driver.findElement(By.xpath("(//input[@class='_2IX_2- VJZDxU'])"));
	//toDoubleClk(p.getRedBusSign());
	//toFillTextBox(p.getEmail(), "murugan12592");
	//toFillTextBox(p.getTxtPass(), "12345pass");
	btnClick(p.getRedBusSign());
	btnClick(p.getOtp());
}


//
}
