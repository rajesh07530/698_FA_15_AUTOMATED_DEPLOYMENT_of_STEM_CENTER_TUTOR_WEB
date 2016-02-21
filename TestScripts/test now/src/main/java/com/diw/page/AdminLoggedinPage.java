package com.diw.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.diw.action.UserActions;

public class AdminLoggedinPage {
	private static String coursenamediv = "div.form-group";
	private static String submit_btn = "//button[@type = 'submit']";
	private static String update_btn = "//button[@type = 'submit']";
	private static String viewcourse_link = "//a[contains(text(),'View Courses')]";
	private static String addcourse_link = "//a[contains(text(),'Add Courses')]";
	

	public AdminLoggedinPage(WebDriver driver) {
			
	}
	
	public static void addCourse(WebDriver driver, String sub){	
		UserActions.waitForPageLoad(driver);
		UserActions.waitForExpectedElementPresence(driver, By.xpath(addcourse_link));
		UserActions.click(driver, By.xpath(addcourse_link));
		UserActions.Type(driver, By.cssSelector(coursenamediv).tagName("input"), sub);
		UserActions.click(driver, By.xpath(submit_btn));
		
	}
	 public static void editCourse(WebDriver driver){
		 UserActions.waitForPageLoad(driver);
		 UserActions.waitForExpectedElementPresence(driver, By.xpath(viewcourse_link));
		 UserActions.click(driver, By.xpath(viewcourse_link));
		 UserActions.click(driver, By.linkText("Edit"));
		 UserActions.click(driver, By.xpath(update_btn));
		 
	 }

}
