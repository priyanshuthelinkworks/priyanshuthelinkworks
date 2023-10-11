package com.runnerNG;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.base.Base_class;

import com.pages.locationMaster;
import org.openqa.selenium.WebElement;

public class Base_Test extends Base_class {

	

	 @DataProvider(name = "json parsing")
	    public String[] dataProvider() throws IOException, ParseException {
	    	
	        JSONParser parser = new JSONParser();
	        
	        FileReader reader= new FileReader("D:\\Agila A\\Workspace\\WMS_SCM\\src\\main\\java\\config\\test_config.json");
	        System.out.println(reader);
	        Object obj = parser.parse(reader);
	        
	        
	        
	        JSONObject jsonObject = (JSONObject) obj;
	        JSONArray array = (JSONArray) jsonObject.get("fields_column");
	        
	        String arr[] = new String[array.size()];
	        
	        for (int i = 0; i < array.size(); i++) {
	        	JSONObject location = (JSONObject) array.get(i);
	        	
	        	String field = (String) location.get("field");
	        	String xpath = (String) location.get("xpath");
	        	String Type = (String) location.get("type");
	        	String Testdata = (String) location.get("testData");
	        	String Inputdata = (String) location.get("DDPath");
	        	
	        	arr[i] = field +",";
			}
			return arr;
	           }
	    @Test(dataProvider = "Jsom parsing")
	       public void reader(String data) {
	    	
	    	String User[] = data .split(",");
	    	System.out.println(User[0]);
	    	
	    }

	@BeforeClass
	public void BeforeClass() throws InterruptedException, IOException {
		browserlanuch("chrome");
		locationMaster locationMaster = new locationMaster();
	}
	@AfterClass
	public void AfterClass() {
		//driver.close();
	}
}



