package org.pojo;

import org.Task.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PojoTask5 extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("http://www.adactin.com/HotelApp/");
		maxWindow();
		toApplyWait();
		//toGetTitle();
		//toGetUrl();
		PojoTask p= new PojoTask();
		toFillTextBox(p.getTxtUser(), "murugan12");
		toFillTextBox(p.getTxtPass(), "168RVE");
		btnClick(p.getBtnLogin());
		toSelectValue(p.getLoc(), "Sydney");
		toSelectValue(p.getHot(), "Hotel Creek");
		toSelectValue(p.getRoom(), "Super Deluxe");
		toSelectValue(p.getRnos(), "4");
		toSelectValue(p.getAdro(), "2");
		toSelectValue(p.getChro(), "2");
		btnClick(p.getSear());
		btnClick(p.getRad());
		btnClick(p.getCon());
		toFillTextBox(p.getNam(), "murugan");
		toFillTextBox(p.getLas(), "L");
		toFillTextBox(p.getAdd(), "no 2, SMR STREET, GANDHI NAGAR, PATTABIRAM");
		toFillTextBox(p.getCard(), "1234567887654321");
		toSelectValue(p.getTyp(), "VISA");
		toSelectValue(p.getMon(), "5");
		toSelectValue(p.getYear(), "2022");
		toFillTextBox(p.getCvv(), "123");
		btnClick(p.getBook());
		WebElement refno= driver.findElement(By.id("order_no"));
		String s1=toGetValue(refno);
		System.out.println("Order Number:"+s1);
		
		//String s1=toGetValue(p.getRefno());
		//System.out.println("Order Ref Number:"+s1);
		
	}

}
