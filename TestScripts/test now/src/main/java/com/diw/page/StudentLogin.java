package com.diw.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.diw.action.UserActions;
import com.diw.page.CoursesPage;

public class StudentLogin {
	private static String email = ".//input[@name='username']";
	private static String pwd = ".//input[@name='password']";
	private static String signin = "//button[@class= 'btn btn-two']";
	
	public StudentLogin(WebDriver driver){
		
	}
	public static StudentProfile doStudentlogin(WebDriver driver,String email_id,String password){
		CoursesPage.clickOnsigninLink(driver);
		UserActions.Type(driver, By.xpath(email), email_id);
		UserActions.Type(driver, By.xpath(pwd), password);
		UserActions.click(driver, By.xpath(signin));
		return new StudentProfile(driver);
		
	}
	

}
