package org.sample;

import java.io.IOException;

import org.Task.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HotelTask extends BaseClass {
	public static void main(String[] args) throws IOException {
		launchBrowser();
		launchUrl("http://adactinhotelapp.com/");
		maxWindow();
		toApplyWait();
		WebElement tc=driver.findElement(By.xpath("(//input[@name='username'])"));
		toFillTextBox(tc, readFromExcel(0, 0));
		
		WebElement pas=driver.findElement(By.xpath("(//input[@name='password'])"));
		toFillTextBox(pas, readFromExcel(1, 0));
		
		WebElement log= driver.findElement(By.xpath("(//input[@type='Submit'])"));
		btnClick(log); 
		
		WebElement loc= driver.findElement(By.xpath("(//select[@name='location'])"));
		toSelectValue(loc, readFromExcel(2, 0));
		
		WebElement hot= driver.findElement(By.id("hotels"));
		toSelectValue(hot, readFromExcel(3, 0));
		
		WebElement room= driver.findElement(By.id("room_type"));
		toSelectValue(room, readFromExcel(4, 0));
		
		WebElement rnos= driver.findElement(By.id("room_nos"));
		toSelectValue(rnos, readFromExcel(5, 0));
		
		WebElement adro= driver.findElement(By.id("adult_room"));
		toSelectValue(adro, readFromExcel(6, 0));
		
		WebElement chro= driver.findElement(By.id("child_room"));
		toSelectValue(chro, readFromExcel(7, 0));
		
		WebElement sear= driver.findElement(By.id("Submit"));
		btnClick(sear);
		
		WebElement rad= driver.findElement(By.id("radiobutton_0"));
		btnClick(rad);
		
		WebElement con= driver.findElement(By.id("continue"));
		btnClick(con);
		
		WebElement nam= driver.findElement(By.id("first_name"));
		toFillTextBox(nam, readFromExcel(8, 0));
		
		WebElement las= driver.findElement(By.id("last_name"));
		toFillTextBox(las, readFromExcel(9, 0));
		
		WebElement add= driver.findElement(By.id("address"));
		toFillTextBox(add, readFromExcel(10, 0));
		
		WebElement card= driver.findElement(By.id("cc_num"));
		toFillTextBox(card, readFromExcel(11, 0));
		
		WebElement typ= driver.findElement(By.id("cc_type"));
		toSelectValue(typ, readFromExcel(12, 0));
		
		WebElement mon= driver.findElement(By.id("cc_exp_month"));
		toSelectValue(mon, readFromExcel(13, 0));
		
		WebElement year= driver.findElement(By.id("cc_exp_year"));
		toSelectValue(year, readFromExcel(14, 0));
		
		WebElement cvv= driver.findElement(By.id("cc_cvv"));
		toFillTextBox(cvv, readFromExcel(15, 0));
		
		WebElement book= driver.findElement(By.id("book_now"));
		btnClick(book);
		
		WebElement refno= driver.findElement(By.id("order_no"));
		String s1=toGetValue(refno);
		
		System.out.println("Order Number:"+s1);
	}

}
