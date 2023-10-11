package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class locationMaster {

	//public WebDriver driver;

	// Constructor to initialize the driver and initialize elements with PageFactory

	/*
	 * public locationMaster(WebDriver driver) { this.driver = driver;
	 * PageFactory.initElements(driver, locationMaster.class); }
	 */

	@FindBy(xpath = "//div[@title='Add New Location']//*[name()='svg']")
	public static WebElement addNewLocation;

	@FindBy(xpath = "//input[@id='collapse-checkbox-0']") 
	public static WebElement firstcollapsebtn;

	@FindBy(xpath = "//input[@name='LOCID']")
	public static WebElement LocationId;

	@FindBy(xpath ="//input[@name='LOCID']//following::div[@class='MuiFormControl-root MuiTextField-root w-11/12 css-141utrw']")
	public static WebElement LocationType;

	@FindBy(xpath = "//li[text()='Basement Dock-01']")
	public static WebElement LocationTypeList;

	@FindBy(xpath = "//input[@name='LOCDESC']")
	public static WebElement LocationDescription;

	@FindBy(xpath = "//input[@name='COMPANY']")
	public static WebElement Company;

	@FindBy(xpath = "//input[@name='WHSE']")
	public static WebElement WHSE;

	@FindBy(xpath = "//input[@name='WHSE']//following::div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']")
	public static WebElement LocationClass;

	@FindBy(xpath = "//li[text()='Dock Door']")
	public static WebElement locationClasslist;

	@FindBy(xpath = "//input[@id='collapse-checkbox-1']")
	public static WebElement secondCollapsebtn;

	@FindBy(xpath = "//input[@name='FLOOR']")
	public static WebElement Floor;

	@FindBy(xpath = "//input[@name='LOCROW']")
	public static WebElement Row;

	@FindBy(xpath = "//input[@name='LOCCOLUMN']")
	public static WebElement Column;

	@FindBy(xpath = "//input[@name='LOCPOSITION']")
	public static WebElement Position;

	@FindBy(xpath = "//input[@name='CONTROLCD']")
	public static WebElement ControlCode;

	@FindBy(xpath = "//input[@name='PICKSEQ']")
	public static WebElement PickSequence;

	@FindBy(xpath = "//input[@name='FILLSEQ']")
	public static WebElement FillSequence;

	@FindBy(xpath = "//input[@name='FILLSEQ']//following::div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']")
	public static WebElement LocationAccessCode;

	@FindBy(xpath = "//li[text()='High']")
	public static WebElement locationAccessCodelist;

	@FindBy(xpath = "//input[@name='FILLSEQ']//following::div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']//following::div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']")
	public static WebElement PutZone;

	@FindBy(xpath = "//li[text()='B Zone']")
	public static WebElement PutZonelist;

	@FindBy(xpath = "//input[@name='ALLOCATABLE']")
	public static WebElement AllocatableInventory;

	@FindBy(xpath = "//input[@id='collapse-checkbox-2']")
	public static WebElement thirdCollapsebtn;

	@FindBy(xpath = "//input[@name='TRANSFERIN']")
	public static WebElement TransferInLocation1;

	@FindBy(xpath = "//input[@name='TRANSFEROUT']")
	public static WebElement TransferInLocation2;

	@FindBy(xpath = "//input[@name='TRANSFEROUT']//following::div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']")
	public static WebElement WorkArea;

	@FindBy(xpath = "//li[text()='B2']")
	public static WebElement WorkArealist;

	@FindBy(xpath = "//input[@name='PFSKUCODE']")
	public static WebElement PickFaceSkuCode;

	@FindBy(xpath = "//input[@name='PARTIALPICK']")
	public static WebElement PartialPutaway;

	@FindBy(xpath = "//input[@name='LOCFREE']")
	public static WebElement LocationFree;

	@FindBy(xpath = "//input[@id='collapse-checkbox-3']")
	public static WebElement fourthCollpasebtn;

	@FindBy(xpath = "//input[@name='LENGTH']")
	public static WebElement Length;

	@FindBy(xpath = "//input[@name='WIDTH']")
	public static WebElement Width;

	@FindBy(xpath = "//input[@name='HEIGHT']")
	public static WebElement Height;

	@FindBy(xpath = "//input[@name='LOCCLASSTYPE']")
	public static WebElement LocationClass1;

	@FindBy(xpath = "//input[@name='MULTIEXPDT']")
	public static WebElement AllowMultipleExpiryDate;

	@FindBy(xpath = "//input[@name='MULTIMRP']")
	public static WebElement AllowMultipleMrp;

	@FindBy(xpath = "//input[@name='LDUNIT']")
	public static WebElement LoadUnitId;

	@FindBy(xpath = "//input[@name='BESTFITTYPE']")
	public static WebElement BestFitType;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement savebtn;


	@FindBy(xpath = "//button[text()='Discard']")
	public WebElement discardbtn;

	
	//**************************************************************************************
		//*****************************************************************************************
	
	@FindBy(xpath = "//h6[text()='Maintain Locations']")
	public static WebElement headertext;
		
	@FindBy(xpath = "//input[@id=':R1qml6:']")
	public static WebElement mainsearchbtn;

	@FindBy(xpath = "//div[@title='Filter']") 
	public static WebElement filterbtn;

	@FindBy(xpath = "//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl css-1v4ccyo'][1]") 
	public static WebElement FilterLocType;

	@FindBy(xpath = "//li[text()='Basement Dock-03']") 
	public static WebElement FilterLocTypeList;

	@FindBy(xpath = "//label[text()='Location Class']//following::div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb'][1]") 
	public static WebElement filterlocclass;

	@FindBy(xpath = "//li[text()='Dock Door']") 
	public static WebElement filterlocclasslist;

	@FindBy(xpath = "//input[@name='CONTROLCD']") 
	public static WebElement filtercontrolcode;

	@FindBy(xpath = "//input[@name='CONTROLCD']//following::div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']")
	public static WebElement filterlocAcccode;

	@FindBy(xpath = "//li[text()='High']") 
	public static WebElement filterlocAcccodelist;

	@FindBy(xpath = "//input[@name='LOCACCCODE']//following::div[@class='MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input css-qiwgdb']") 
	public static WebElement filterputzone;

	@FindBy(xpath = "//li[text()='C Zone']") 
	private WebElement filterputzonelist;

	@FindBy(xpath = "//input[@name='PFSKUCODE']") 
	public static WebElement filterpfskucode;

	@FindBy(xpath = "//span[text()='Select']") 
	public static WebElement filterselectbtn;

	@FindBy(xpath = "//tr[@class='MuiTableRow-root MuiTableRow-head css-y34huh']") 
	public static WebElement selectFirstRow;

	@FindBy(xpath = "//div[@class='flex items-center filter bg-[#0aa0ed] ml-2'][1]") 
	public static WebElement duplicatebtn;

	@FindBy(xpath = "") 
	public static WebElement duplicatealertyes;

	@FindBy(xpath = "//tr[@class='MuiTableRow-root css-1kembiv'][3]") 
	public static WebElement selectThirdrow;

	@FindBy(xpath = "//div[@class='flex items-center filter bg-[#0aa0ed] ml-2'][2]") 
	public static WebElement deletebtn;

	@FindBy(xpath = "//button[text()='ok']") 
	public static WebElement deletealertYes;
	
	@FindBy(xpath = "//button[text()='Cancel']") 
	public static WebElement deletealertcancel;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1nwp3l9']") 
	public static WebElement collapseallbtn;

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-149ryfa']") 
	public static WebElement singlecollapsebtn;

	}

