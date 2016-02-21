package com.diw.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.diw.action.UserActions;

public class AdminLoginPage {
	private static String adminusername = "//input[@name = 'username']";
	private static String adminpassword = "//input[@name = 'password']";
	private static String adminsignin = "//button[@value = 'admin_login']";
	
	public AdminLoginPage(WebDriver driver){
		
	}
	
	public static AdminLoggedinPage doAdminLogin(WebDriver driver, String email_id, String password){
		UserActions.Type(driver, By.xpath(adminusername), email_id);
		UserActions.Type(driver, By.xpath(adminpassword), password);
		UserActions.click(driver, By.xpath(adminsignin));
		return new AdminLoggedinPage(driver);
		
	}
	
	

}
