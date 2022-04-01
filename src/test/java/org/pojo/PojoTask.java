package org.pojo;

import org.Task.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class PojoTask extends BaseClass {
	public PojoTask() {
	PageFactory.initElements(driver, this);
	}
	//For Hotel Task
	@FindBy(id="username")
	private WebElement txtUser;
	public WebElement getEmail() {
		return email;
	}
	//For demoqa page  
	@FindBy(id="firstName")
	private WebElement firstName;
	
	//For demoqa page  
		@FindBy(id="lastName")
		private WebElement lastName;
	
	//For FB
	@FindBy(id="email")
	private WebElement email;
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}
	//For FB & Hotel Task
	@FindAll({
		@FindBy(id="password"),
		@FindBy(name="pass")})
	private WebElement txtPass;
	
	
	//For FB & Hotel Task
	@FindAll({
	@FindBy(name="login"),
	@FindBy(id="i-icon-profile")})
	private WebElement btnLogin;
	
	
	public WebElement getOtp() {
		return otp;
	}

	public WebElement getRedBusSign() {
		return redBusSign;
	}
	@FindAll({
		@FindBy(id="manageHeaderdd"),
		@FindBy(name="Sign in with Google")})
	private WebElement redBusSign;
	
	
	@FindBy(id="rh_main")
	private WebElement otp;
	
	@FindBy(id="recaptcha-anchor-label")
	private WebElement capcha;
	
		
	
	public WebElement getCapcha() {
		return capcha;
	}
	@FindBy(id="location")
	private WebElement loc;
	
	
	@FindBy(id="hotels")
	private WebElement hot;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement rnos;
	
	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHot() {
		return hot;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRnos() {
		return rnos;
	}

	public WebElement getAdro() {
		return adro;
	}

	public WebElement getChro() {
		return chro;
	}

	public WebElement getSear() {
		return sear;
	}

	public WebElement getRad() {
		return rad;
	}

	public WebElement getCon() {
		return con;
	}

	public WebElement getNam() {
		return nam;
	}

	public WebElement getLas() {
		return las;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getTyp() {
		return typ;
	}

	public WebElement getMon() {
		return mon;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getRefno() {
		return refno;
	}
	@FindBy(id="adult_room")
	private WebElement adro;
	
	@FindBy(id="child_room")
	private WebElement chro;
	
	@FindBy(id="Submit")
	private WebElement sear;
	
	@FindBy(id="radiobutton_0")
	private WebElement rad;
	
	@FindBy(id="continue")
	private WebElement con;
	
	
	@FindBy(id="first_name")
	private WebElement nam;
	
	@FindBy(id="last_name")
	private WebElement las;
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement card;
	
	@FindBy(id="cc_type")
	private WebElement typ;
	
	@FindBy(id="cc_exp_month")
	private WebElement mon;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;
		
	@FindBy(id="order_no")
	private WebElement refno;
	
	
	
	
	
	
	
	
}
