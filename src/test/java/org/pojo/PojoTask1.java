package org.pojo;
import org.Task.BaseClass;
public class PojoTask1 extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		maxWindow();
		PojoTask p = new PojoTask();
		toFillTextBox(p.getEmail(), "murugan12592");
		toFillTextBox(p.getTxtPass(), "12345pass");
		btnClick(p.getBtnLogin());
	}

}
//manageHeaderdd