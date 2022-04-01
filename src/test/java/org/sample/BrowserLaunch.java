package org.sample;

import org.Task.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("http://adactinhotelapp.com/");
		maxWindow();
		toApplyWait();
		toGetTitle();
		toGetUrl();
	WebElement user= driver.findElement(By.xpath("(//input[@name='username'])"));
	toFillTextBox(user, "murugan12");
	WebElement pass= driver.findElement(By.xpath("(//input[@name='password'])"));
	toFillTextBox(pass, "168RVE");
	WebElement log= driver.findElement(By.xpath("(//input[@type='Submit'])"));
	btnClick(log);//(//input[@type='Submit'])

	//WebElement loc1= driver.findElement(By.xpath("(//td[text()='Location'])"));
	//btnClick(loc1);
	
	//toApplyWait();
	WebElement loc= driver.findElement(By.xpath("(//select[@name='location'])"));
	toSelectValue(loc, "Sydney");
	WebElement hot= driver.findElement(By.id("hotels"));
	toSelectValue(hot, "Hotel Creek");
	WebElement room= driver.findElement(By.id("room_type"));
	toSelectValue(room, "Super Deluxe");
	WebElement rnos= driver.findElement(By.id("room_nos"));
	toSelectValue(rnos, "4");
	WebElement adro= driver.findElement(By.id("adult_room"));
	toSelectValue(adro, "2");
	WebElement chro= driver.findElement(By.id("child_room"));
	toSelectValue(chro, "2");
	WebElement sear= driver.findElement(By.id("Submit"));
	btnClick(sear);
	WebElement rad= driver.findElement(By.id("radiobutton_0"));
	btnClick(rad);
	WebElement con= driver.findElement(By.id("continue"));
	btnClick(con);
	WebElement nam= driver.findElement(By.id("first_name"));
	toFillTextBox(nam, "Murugan");
	WebElement las= driver.findElement(By.id("last_name"));
	toFillTextBox(las, "L");
	WebElement add= driver.findElement(By.id("address"));
	toFillTextBox(add, "No:2, Smr Street, pattabiram, chennai-600072");
	WebElement card= driver.findElement(By.id("cc_num"));
	toFillTextBox(card, "1234567887654321");
	WebElement typ= driver.findElement(By.id("cc_type"));
	toSelectValue(typ, "VISA");
	WebElement mon= driver.findElement(By.id("cc_exp_month"));
	toSelectValue(mon, "5");
	WebElement year= driver.findElement(By.id("cc_exp_year"));
	toSelectValue(year, "2022");
	WebElement cvv= driver.findElement(By.id("cc_cvv"));
	toFillTextBox(cvv, "123");
	
	WebElement book= driver.findElement(By.id("book_now"));
	btnClick(book);
	WebElement refno= driver.findElement(By.id("order_no"));
	String s1=toGetValue(refno);
	System.out.println("Order Number:"+s1);
	

		//toMove(loc);
		//toApplyWait();
	//WebElement loc2= driver.findElement(By.xpath("(//option[@value='London'])'])"));
	//btnClick(loc2);
	//s.selectByValue("Sydney");
	//s.selectByVisibleText("London");
	
	}
	

}
