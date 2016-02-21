package com.diw.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.diw.action.UserActions;

public class TutorProfile {
	private static String logout = "//ul/li[5]/a";

	public TutorProfile(WebDriver driver) {
		
	}
	
	public static void doTutorLogout(WebDriver driver){
		UserActions.click(driver, By.xpath(logout));
		
	}

}
