package com.diw.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.diw.action.UserActions;

public class TutorLoginPage {
	private static String email= "//input[@name = 'username']";
	private static String pwd = "//input[@name = 'password']";
	private static String signin = "//button[@class= 'btn btn-two']";

	public TutorLoginPage(WebDriver driver) {
		
	}
	public static TutorProfile doTutorLogin(WebDriver driver, String email_id, String password){
		CoursesPage.cllickOnTutorLogin(driver);
		UserActions.Type(driver, By.xpath(email), email_id);
		UserActions.Type(driver, By.xpath(pwd), password);
		UserActions.click(driver, By.xpath(signin));
		return new TutorProfile(driver);
		
	}

}
