package org.Task;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pojo.PojoTask;
import junit.framework.Assert;
public class Junit extends BaseClass {
	 static PojoTask p;
	 @Before
	 public void bf() {
	launchBrowser();
	launchUrl("https://www.facebook.com/");
	maxWindow();
	 }
	 @Test
	 public void fb() {
p=new PojoTask ();
WebElement user = p.getEmail();
toFillTextBox(user, "murugan12592");
String u1=toGetValue(user);
Assert.assertEquals("Check user name", "murugan12592", u1);
WebElement pass = p.getTxtPass();
toFillTextBox(pass, "Log@12592");
String p1=toGetValue(pass);
Assert.assertEquals("Chek the Password", "Log@12592", p1);
	WebElement login = p.getBtnLogin();
	btnClick(login);
	 }
	 
}
