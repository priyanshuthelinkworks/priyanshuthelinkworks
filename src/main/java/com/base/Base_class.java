package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.locationMaster;

public class Base_class {
	
	public static WebDriver driver;
	public static Properties properties=null;
	
	public static void browserlanuch(String name) throws InterruptedException {

		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver117\\chromedriver-win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://miebach.thelinkworks.com:3000/masters/location-master");
			Thread.sleep(5000);

		} else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\ChromeDriver117\\chromedriver-win32\\chromedriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}
	
	  public Properties loadPropertyFile() throws IOException { 
		  loadPropertyFile();
	  	  
	  FileInputStream fileInputStream=new FileInputStream("src\\main\\java\\com\\resources\\configuration"); 
	  Properties properties=new Properties(); 
	  properties.load(fileInputStream); 
	  return properties; }
	 
	public static void set() {
		//readConfig();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver117\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("http://miebach.thelinkworks.com:3000/masters/location-master");
		driver.manage().window().maximize();
			}

	public static void Geturl(String Url) {
		Geturl(Url);
	}

	public static void sendvalue(WebElement Element, String value) {
		Element.sendKeys(value);
	}

	public static void click(WebElement Element) {
		Element.click();
	}

	public static void wait(int w) throws InterruptedException {
		Thread.sleep(w);
	}

	public static void clear(WebElement Element) {
		Element.clear();
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void dropdown(WebElement Element, String option, String value) {
		Select select = new Select(Element);
		if (option.equalsIgnoreCase("index")) {
			select.selectByIndex(Integer.parseInt(value));
		} else if (option.equalsIgnoreCase("visbletext")) {
			select.selectByVisibleText(value);

		} else if (option.equalsIgnoreCase("Value")) {
			select.selectByValue(value);
		} else if (option.equalsIgnoreCase("size")) {
			select.getOptions();
		}
	}

	public static void Alert(String alert) {
		if (alert.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}

		else if (alert.equalsIgnoreCase("CanCel")) {// cancel
			driver.switchTo().alert().dismiss();
		} else if (alert.equalsIgnoreCase("size")) {
			driver.switchTo().alert().getText();
		}
	}

	public static void getcurrenturl(String method) {
		if (method.equalsIgnoreCase("currenturl")) {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			System.out.println(driver.getCurrentUrl());
		}
	}

	public static void gettitle(String method) {
		if (method.equalsIgnoreCase("tiTle")) {
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println(driver.getTitle());
		}
	}

	public static void Actions(WebElement Element, String option) {
		Actions actions = new Actions(driver);
		if (option.equalsIgnoreCase("perform")) {
			actions.moveToElement(Element).build().perform();
		} else if (option.equalsIgnoreCase("build")) {
			actions.moveToElement(Element).build();
		} else if (option.equalsIgnoreCase("click")) {
			actions.moveToElement(Element).click().build().perform();
		}
	}

	public static void draganddrop(WebElement from, WebElement to) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(from, to).build().perform();
	}

	public static void radiobutton(WebElement Element) {
		Element.click();
	}

	public static void Checkbox(WebElement Element) {
		Element.click();
	}

	public static void back(String back) {
		if (back.equalsIgnoreCase("back")) {
			driver.navigate().back();

		} else if (back.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}

	public static void isselected(WebElement e) {
		boolean selected = e.isSelected();
		System.out.println(selected);
	}

	public static void ismethod(WebElement e) {
		boolean enabled = e.isEnabled();
		System.out.println(enabled);
	}

	public static void scroll(int s1, int s2) {
		int top = s1;
		int down = s2;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroBy(" + top + "," + down + ")");
	}

	public static void frameMethod(WebElement Element, String id, String frametype, int index) {
		if (frametype.equalsIgnoreCase("id")) {
			driver.switchTo().frame(id);
		} else if (frametype.equalsIgnoreCase("webelement")) {
			driver.switchTo().frame(Element);
		} else if (frametype.equalsIgnoreCase("index")) {
			driver.switchTo().frame(index);
		} else if (frametype.equalsIgnoreCase("perent")) {
			driver.switchTo().parentFrame();
		} else if (frametype.equalsIgnoreCase("defultconent")) {
			driver.switchTo().defaultContent();
		}
	}

	public static String Windowhandle() {
		String windowHandle = driver.getWindowHandle();
		return (windowHandle);
	}

	public static Set<String> windowhandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return (windowHandles);
	}
	/*
	 * public static String DataDriven(String Sheetname, int Row, int Cell) throws
	 * IOException { FileInputStream fileInput = new FileInputStream(" ");
	 * XSSFWorkbook workbook = new XSSFWorkbook(fileInput); XSSFSheet sheet =
	 * workbook.getSheet(Sheetname); XSSFRow row = sheet.getRow(Row); XSSFCell
	 * column = row.getCell(Cell); int cellType = column.getCellType(); String value
	 * = ""; if (cellType == 1) { value = column.getStringCellValue();
	 * 
	 * } else if (DateUtil.isCellDateFormatted(column)) { Date dateCell =
	 * column.getDateCellValue(); SimpleDateFormat dateFormat = new
	 * SimpleDateFormat("dd.mm.yyyy"); value = dateFormat.format(dateCell); }
	 * 
	 * else { double numericCellValue = column.getNumericCellValue(); long longs =
	 * (long)numericCellValue; value = String.valueOf(longs); } return value; }
	 */
	
	
			
	}
	
