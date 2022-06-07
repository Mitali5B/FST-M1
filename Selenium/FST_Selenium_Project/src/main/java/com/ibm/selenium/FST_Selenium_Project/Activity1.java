package com.ibm.selenium.FST_Selenium_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity1 {
	public static void main(String[] args) {
	
	    	
	        
	    	
	        // Create a new instance of the Firefox driver
		
	        WebDriver driver = new FirefoxDriver();
		
			
		
	        // Open the browser
		
	        driver.get("https://www.training-support.net");
		
			
		
	        // Close the browser
		
	        driver.close();
		
	    }
	
	
	
}
