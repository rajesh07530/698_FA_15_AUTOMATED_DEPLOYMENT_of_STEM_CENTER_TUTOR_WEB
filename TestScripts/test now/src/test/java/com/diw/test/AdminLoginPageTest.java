package com.diw.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Step;

import com.diw.main.RootTest;
import com.diw.page.AdminLoggedinPage;
import com.diw.page.AdminLoginPage;
import com.diw.page.StudentLogin;

public class AdminLoginPageTest extends RootTest {
	private WebDriver driver;
	private static String url = "http://localhost:8081/STEM-TUTOR-STUDENT/STEM-ADMIN/";
	
	@BeforeClass
	public void setDriver(){
		driver=super.getDriver();
		driver.get(url);
		driver.manage().deleteAllCookies();
	
	}
	
	@Parameters({ "emailadmin", "pwdadmin" })
	@Step("Enter user name,pwd and click on sigin btn & verify the signin ")
	@Test	
	public void checkAdminLogin(String email_id, String pwd){
		AdminLoginPage.doAdminLogin(driver, email_id, pwd);
		Assert.assertTrue(driver.getTitle().contains("Admin"));				
	}
	
	
	@Parameters({ "sub"})
	@Step("Add course and verify ")
	@Test(dependsOnMethods = {"checkAdminLogin"})	
	public void checkAddCourse(String sub){
		AdminLoggedinPage.addCourse(driver, sub);
		Assert.assertTrue(driver.findElement(
				By.xpath("//b[contains(text(),'All Courses List')]")).isDisplayed());
					
	}
	
	@Step("EditCourse and verify ")
	@Test(dependsOnMethods = {"checkAddCourse"})
	public void checkEditCourse(){
		AdminLoggedinPage.editCourse(driver);
		Assert.assertTrue(driver.findElement(
				By.xpath("//b[contains(text(),'All Courses List')]")).isDisplayed());
	}


}
