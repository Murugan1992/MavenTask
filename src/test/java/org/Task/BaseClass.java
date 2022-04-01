package org.Task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Select s;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static String toGetTitle() {
		String title = driver.getTitle();
		System.out.println("Title:" + title);
		return title;

	}

	public static String toGetUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("Url:" + url);
		return url;
	}

	public static void toClose() {
		driver.quit();

	}

	public static void toFillTextBox(WebElement ele, String val) {
		ele.sendKeys(val);

	}

	public static void btnClick(WebElement e) {
		e.click();
	}

	public static void toApplyWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public static String toGetValue(WebElement ele) {
		String name = ele.getAttribute("value");
		return name;

	}

	public static void toMove(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();

	}

	public static void toDoubleClk(WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();

	}

	public static void toRightclick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).perform();

	}

	public static void toCopy() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void toSelectValue(WebElement e, String val) {
		Select s = new Select(e);
		s.selectByValue(val);

	}

	public static void toSelectInd(WebElement e, int ind) {
		Select s = new Select(e);
		s.selectByIndex(ind);

	}

	public static void toTakeSnap(String filename) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\VIGNESH VICKY\\eclipse-workspace\\MavenTask\\ScreenShot" + filename + ".png");
		FileUtils.copyFile(src, dest);

	}

	public static String getName() {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		return name;
	//}

	//public static String readFromExcel(String shName, int row, int cell) throws IOException {
		//File f = new File("C:\\Users\\VIGNESH VICKY\\eclipse-workspace\\MavenTask\\Excel\\DataInput.xlsx");
		//FileInputStream fin = new FileInputStream(f);
		//Workbook book = new XSSWorkbook(fin);
		//Sheet sh = book.getSheet(shName);
		//Row r = sh.getRow(row);
		//Cell c = r.getCell(cell);
		//int type = c.getCellType();
		//String data="";
		//if (type == 1) {
		//data = c.getStringCellValue();

		//} else if (DateUtil.isCellDateFormatted(c)) {
		//	Date d = c.getDateCellValue();
		//	SimpleDateFormat s = new SimpleDateFormat("DD-MM-yyyy");
		//	data = s.format(d);
		//} else {
		//	double d = c.getNumericCellValue();
			//long l = (long) d;
			//data = String.valueOf(1);
		//}
		//return data;

	}
}
