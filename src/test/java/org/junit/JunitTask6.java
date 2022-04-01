package org.junit;
import org.Task.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.PojoTask;
   import junit.framework.Assert;

public class JunitTask6 extends BaseClass {
	 static PojoTask p;
	 @Before
	 public void bf() {
	launchBrowser();
	launchUrl("http://www.adactin.com/HotelApp/");
	maxWindow();
	 }
	 @Test
	 public void logHotel() {
p=new PojoTask ();
WebElement user = p.getTxtUser();
toFillTextBox(p.getTxtUser(), "murugan12");
String u1=toGetValue(user);
Assert.assertEquals("Check user name", "murugan12", u1);
WebElement pass = p.getTxtPass();
toFillTextBox(p.getTxtPass(), "168RVE");
String p1=toGetValue(user);
Assert.assertEquals("Check user name", "murugan12", p1);
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

}}
