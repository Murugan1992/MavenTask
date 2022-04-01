package org.pojo;

import java.io.IOException;
import org.Task.BaseClass;


public class PojoTask6 extends BaseClass {
public static void main(String[] args) throws IOException {
	launchBrowser();
	launchUrl("http://www.adactin.com/HotelApp/");
	maxWindow();
	toApplyWait();
	//toGetTitle();
	//toGetUrl();
	PojoTask p= new PojoTask();
	toFillTextBox(p.getTxtUser(),readFromExcel(0, 0));
	toFillTextBox(p.getTxtPass(), readFromExcel(1, 0));
	btnClick(p.getBtnLogin());
	toSelectValue(p.getLoc(), readFromExcel(2, 0));
	toSelectValue(p.getHot(), readFromExcel(3, 0));
	toSelectValue(p.getRoom(), readFromExcel(4, 0));
	toSelectValue(p.getRnos(), readFromExcel(5, 0));
	toSelectValue(p.getAdro(), readFromExcel(6, 0));
	toSelectValue(p.getChro(), readFromExcel(7, 0));
	btnClick(p.getSear());
	btnClick(p.getRad());
	btnClick(p.getCon());
	toFillTextBox(p.getNam(), readFromExcel(8, 0));
	toFillTextBox(p.getLas(), readFromExcel(9, 0));
	toFillTextBox(p.getAdd(), readFromExcel(10, 0));
	toFillTextBox(p.getCard(), readFromExcel(11, 0));
	toSelectValue(p.getTyp(), readFromExcel(12, 0));
	toSelectValue(p.getMon(), readFromExcel(13, 0));
	toSelectValue(p.getYear(), readFromExcel(14, 0));
	toFillTextBox(p.getCvv(), readFromExcel(15, 0));
	btnClick(p.getBook());
	//WebElement refno= driver.findElement(By.id("order_no"));
	//String s1=toGetValue(refno);
	//System.out.println("Order Number1:"+s1);
	
	//String s1=toGetValue(p.getRefno());
	//System.out.println("Order Ref Number:"+s1);
	
}
}
