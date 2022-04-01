package org.stepdefinition;
import org.Task.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class HooksClass extends BaseClass{
	@Before
	public void bf() {
		System.out.println("Before Started");
		launchBrowser();
		maxWindow();
			}
	@Before(order=1)
	public void bf1() {
System.out.println("Before:1");
	}
	@Before(order=2)
	public void bf2() {
System.out.println("Before:2");
	}
	@Before(order=3)
	public void bf3() {
System.out.println("Before:3");
	}
	@After
public void aft(){
toClose();
System.out.println("After Ends");
}
	@After(order=1)
	public void af1() {
System.out.println("After:1");
	}
	@After(order=2)
	public void af2() {
System.out.println("After:2");
	}
	@After(order=3)
	public void af3() {
System.out.println("After:3");
	}
}
