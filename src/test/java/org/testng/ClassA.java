package org.testng;

import java.util.Date;

import org.Task.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.pojo.PojoTask;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ClassA extends BaseClass {
	@Test(groups = "smoke")
	private void tc1() {
System.out.println("Test1");
Date d = new Date();
System.out.println(d);
launchBrowser();
launchUrl("https://www.facebook.com/");

	}
@Test(groups = "smoke")
public void tc2() {
	System.out.println("Test2");
PojoTask p = new PojoTask();
toFillTextBox(p.getEmail(), "Murugan12592");
toFillTextBox(p.getTxtPass(), "Log@12592");
btnClick(p.getBtnLogin());
}}



