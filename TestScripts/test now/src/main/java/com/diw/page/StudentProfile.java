package com.diw.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.diw.action.UserActions;

public class StudentProfile {
	
	private static String logout = "//ul/li[5]/a";
	
	public StudentProfile(WebDriver driver){
		
	}
	
	public static void doLogout(WebDriver driver){
		UserActions.waitForPageLoad(driver);
		UserActions.click(driver, By.xpath(logout));
		
	}

}
