package com.runnerNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.base.Base_class;

import com.pages.locationMaster;
import org.openqa.selenium.WebElement;

public class TestRunner extends Base_class {

	locationMaster locationMaster;

	@Test
	public void ValidTest() throws InterruptedException, IOException {

		properties = new Properties();
		try {
			FileInputStream fileInputStream = new FileInputStream("config\\sample.json");
			properties.load(fileInputStream);
			fileInputStream.close();
			System.out.println(fileInputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		PageFactory.initElements(driver, locationMaster.class);

		locationMaster.addNewLocation.click(); 
		wait(3000);
		locationMaster.firstcollapsebtn.click(); 
		wait(3000);
		locationMaster.firstcollapsebtn.click(); 
		wait(3000);
		String[] propertyKeys = {"LocationId", "LocationDescription", "Company", "WHSE"};

		for (String key : propertyKeys) {
			String value = properties.getProperty(key);

			if (value != null) {
				switch (key) {
				case "LocationId":
					locationMaster.LocationId.sendKeys(value);
					break;
				case "LocationType":
					locationMaster.LocationType.sendKeys(value);
					break;
				case "LocationDescription":
					locationMaster.LocationDescription.sendKeys(value);
					break;
				case "Company":
					locationMaster.Company.sendKeys(value);
					break;
				case "WHSE":
					locationMaster.WHSE.sendKeys(value);
					break;
				}
				wait(1000);
			}
		}

		// Define an array of property keys
		String[] propertyKeys1 = {"Floor", "Row", "Column", "Position", "ControlCode", "PickSequence", "FillSequence", "AllocatableInventory"};

		// Collapse button logic
		locationMaster.secondCollapsebtn.click();
		wait(3000);
		locationMaster.secondCollapsebtn.click();
		wait(3000);

		// Loop through the property keys and perform actions
		for (String key : propertyKeys1) {
			String value = properties.getProperty(key);

			// Check if the value is not null before performing actions
			if (value != null) {
				WebElement element = null;		
				switch (key) {
				case "Floor":
					element = locationMaster.Floor;
					break;
				case "Row":
					element = locationMaster.Row;
					break;
				case "Column":
					element = locationMaster.Column;
					break;
				case "Position":
					element = locationMaster.Position;
					break;
				case "ControlCode":
					element = locationMaster.ControlCode;
					break;
				case "PickSequence":
					element = locationMaster.PickSequence;
					break;
				case "FillSequence":
					element = locationMaster.FillSequence;
					break;
				case "AllocatableInventory":
					element = locationMaster.AllocatableInventory;
					break;
				}
				element.sendKeys(value);
				wait(1000);
			}}


		// Define an array of property keys
		String[] propertyKeys2 = {
				"TransferInLocation-1",
				"TransferInLocation-2",
				"WorkArea",
				"PickFaceSkuCode",
				"PartialPutaway",
				"LocationFree",
		};

		// Collapse button logic
		locationMaster.thirdCollapsebtn.click();
		wait(3000);
		locationMaster.thirdCollapsebtn.click();
		wait(3000);


		// Loop through the property keys
		for (String Key : propertyKeys2) {
			String Value = properties.getProperty(Key);
			WebElement element = null;

			// Determine which element to interact with based on the property key
			switch (Key) {
			case "TransferInLocation-1":
				element = locationMaster.TransferInLocation1;
				break;
			case "TransferInLocation-2":
				element = locationMaster.TransferInLocation2;
				break;
			case "WorkArea":
				element = locationMaster.WorkArea;
				break;
			case "PickFaceSkuCode":
				element = locationMaster.PickFaceSkuCode;
				break;
			case "PartialPutaway":
				element = locationMaster.PartialPutaway;
				break;
			case "LocationFree":
				element = locationMaster.LocationFree;
				break;
				// Add more cases for other properties if needed
			}

			// Perform actions on the element
			if (element != null) {
				element.sendKeys(Value);
				wait(1000); // Add the appropriate wait time here
			}}
		// Define an array of property keys
		String[] propertyKeys3 = {
				"Length",
				"Width",
				"Height",
				"LocationClass1",
				"AllowMultipleExpiryDate",
				"AllowMultipleMrp",
				"LoadUnitId",
				"BestFitType"
		};

		// Loop through the property keys
		for (String Key : propertyKeys3) {
			String Value = properties.getProperty(Key);
			WebElement element1 = null;

			// Determine which element to interact with based on the property key
			switch (Key) {
			case "Length":
				element1 = locationMaster.Length;
				break;
			case "Width":
				element1 = locationMaster.Width;
				break;
			case "Height":
				element1 = locationMaster.Height;
				break;
			case "LocationClass1":
				element1 = locationMaster.LocationClass1;
				break;
			case "AllowMultipleExpiryDate":
				element1 = locationMaster.AllowMultipleExpiryDate;
				break;
			case "AllowMultipleMrp":
				element1 = locationMaster.AllowMultipleMrp;
				break;
			case "LoadUnitId":
				element1 = locationMaster.LoadUnitId;
				break;
			case "BestFitType":
				element1 = locationMaster.BestFitType;
				break;
				// Add more cases for other properties if needed
			}

			// Perform actions on the element
			if (element1 != null) {
				element1.sendKeys(Value);
				wait(1000); // Add the appropriate wait time here
			}
		}}
	@BeforeClass
	public void BeforeClass() throws InterruptedException, IOException {
		browserlanuch("chrome");
		locationMaster=new locationMaster();
	}
	@AfterClass
	public void AfterClass() {
		driver.close();
	}
}
