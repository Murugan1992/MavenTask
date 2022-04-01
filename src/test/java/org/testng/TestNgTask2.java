package org.testng;

import java.util.Date;

import org.Task.BaseClass;
import org.pojo.PojoTask;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgTask2 extends BaseClass {
	@BeforeClass
	private void bfCls() {
		System.out.println("Before Class Starterd");
	}
	@AfterClass
	private void aftCls() {
		System.out.println("After Class End");
	}
	@BeforeMethod
	private void bfMtd() {
		Date d = new Date();
		System.out.println(d);
		launchBrowser();
		launchUrl("https://www.redbus.in/");
	}
	@AfterMethod
	private void aftMtd() {
		Date d = new Date();
		System.out.println(d);
		toClose();
	}
	@Test
	private void title() {
		String title = toGetTitle();
		System.out.println("Title:" + title);
	}
	@Test
	private void toFetchUrl() {
		String url = toGetUrl();
		System.out.println("Url:" + url);
	}
	@Test
	private void redBusLogin() {
		PojoTask p = new PojoTask();
	btnClick(p.getBtnLogin());
	//	btnClick(p.getRedBusSign());
	}


}
