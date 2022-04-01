package org.testng;

import java.util.Date;

import org.Task.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pojo.PojoTask;
import org.testng.annotations.Test;

import junit.framework.Assert;
public class ClassB extends BaseClass{
@Test(groups ="sanity")
private void tc11() {
System.out.println("Test11");
Date d = new Date();
System.out.println(d);
launchBrowser();
launchUrl("https://www.facebook.com/");
}@Test(groups = {"smoke","regression"})
public void tc22() {
	System.out.println("Test22");
PojoTask p = new PojoTask();
toFillTextBox(p.getEmail(), "Murugan12592");
toFillTextBox(p.getTxtPass(), "Log@12592");
btnClick(p.getBtnLogin());
}}

