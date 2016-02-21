package com.diw.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Step;

import com.diw.action.UserActions;
import com.diw.main.RootTest;
import com.diw.page.ContactPage;
import com.diw.page.CoursesPage;
import com.diw.page.StudentLogin;
import com.diw.page.StudentProfile;

public class StudentLoginTest extends RootTest{
	private WebDriver driver;
	private static String url = "http://localhost:8081/STEM-TUTOR-STUDENT/";
	
	@BeforeClass
	public void setDriver(){
		driver=super.getDriver();
		driver.get(url);
		driver.manage().deleteAllCookies();
	
	}
	
	@Parameters({ "email", "pwd" })
	@Step("Enter user name,pwd and click on sigin btn & verify the signin ")
	@Test	
	public void checkStudentLogin(String email_id, String pwd){
		StudentLogin.doStudentlogin(driver, email_id, pwd);
		Assert.assertTrue(driver.getTitle().contains("Student"));				
	}
	
	@Step("Click on Logout")
	@Test(dependsOnMethods = {"checkStudentLogin"})
	public void studentlogout()
	{
		StudentProfile.doLogout(driver);
		Assert.assertTrue(driver.getTitle().contains("Tutor|Login"));
		//Assert.assertEquals("Tutor|Login", driver.getTitle());
	}
	/*
	@Step("Contact page")
	@Test()
	public void contact(){
		CoursesPage.clickOnContact(driver);
		UserActions.waitForPageLoad(driver);
		Assert.assertTrue(driver.getTitle().contains("STEM|Contact"));
		//Assert.assertEquals("STEM|Contact", driver.getTitle());
	}
	*/
}
