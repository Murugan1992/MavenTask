package org.junit;

import org.Task.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.PojoTask;

import junit.framework.Assert;

public class JunitTask2 extends BaseClass{
	 static PojoTask p;
	 @Before
	 public void bf() {
	launchBrowser();
	launchUrl("https://www.redbus.in/");
	maxWindow();
	 }
	 @Test
	 public void redBus() {
p=new PojoTask ();
btnClick(p.getBtnLogin());
btnClick(p.getRedBusSign());
//toFillTextBox(p.getOtp(), "7299858915");
//btnClick(p.getOtp());
//toDoubleClk(p.getOtp());
 // toRightclick(p.getOtp());


//WebElement otp = p.getOtp();
//toFillTextBox(otp, "7299858915");
//String u1=toGetValue(user);
//Assert.assertEquals("Check user name", "murugan12592", u1);
//WebElement pass = p.getTxtPass();
//toFillTextBox(pass, "Log@12592");
//String p1=toGetValue(pass);
//Assert.assertEquals("Chek the Password", "Log@12592", p1);
//	WebElement login = p.getBtnLogin();
//	btnClick(login);

}
}