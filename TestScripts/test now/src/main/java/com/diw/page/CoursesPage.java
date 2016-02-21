package com.diw.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.diw.action.UserActions;

public class CoursesPage {
	
	private static String student = ".//*[@id='navbar-collapse-1']/ul/li[2]/a";
	private static String student_login_link = ".//*[@id='navbar-collapse-1']/ul/li[2]/ul/li[1]/a";
	private static String student_register_link = ".//*[@id='navbar-collapse-1']/ul/li[2]/ul/li[2]/a";
	private static String contact = ".//*[@id='navbar-collapse-1']/ul/li[4]/a";
	private static String tutor = "//*[@id='navbar-collapse-1']/ul/li[3]/a";
	private static String tutor_login_link = ".//*[@id='navbar-collapse-1']/ul/li[3]/ul/li[1]";
			
	public CoursesPage(WebDriver driver){
		
	}
	
	public static StudentLogin clickOnsigninLink(WebDriver driver){
		UserActions.click(driver,By.xpath(student));
		UserActions.click(driver, By.xpath(student_login_link));
		return new StudentLogin(driver);
	}
	
	public static StudentRegistration clickOnStudentRegister(WebDriver driver){
		UserActions.click(driver, By.xpath(student_register_link));
		return new StudentRegistration(driver);
	}
	
	public static ContactPage clickOnContact(WebDriver driver){
		UserActions.click(driver, By.xpath(contact));
		return new ContactPage(driver);
		
	}
	
	public static TutorLoginPage cllickOnTutorLogin(WebDriver driver){
		UserActions.click(driver, By.xpath(tutor));
		UserActions.click(driver, By.xpath(tutor_login_link).tagName("a"));
		return new TutorLoginPage(driver);
	}

}
