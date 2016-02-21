package com.diw.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;
import com.diw.main.RootTest;
import com.diw.page.TutorLoginPage;
import com.diw.page.TutorProfile;

public class TutorLoginPageTest extends RootTest{
	private WebDriver driver;
	
	@BeforeClass
	public void setDriver(){
		driver = super.getDriver();
		driver.manage().deleteAllCookies();
	}
	
	@Parameters({ "emailt", "pwdt" })
	@Step("Tuorlogin Enter email, password")
	@Test
	public void checkTutorLogin(String email_id, String pwd){
		TutorLoginPage.doTutorLogin(driver, email_id, pwd);
		Assert.assertTrue(driver.getTitle().contains("Tutor"));
	}
	
	@Step("Tutor Logout")
	@Test(dependsOnMethods = {"checkTutorLogin"})
	public void checkTutorLogout(){
		TutorProfile.doTutorLogout(driver);
		Assert.assertTrue(driver.getTitle().contains("Tutor|Login"));
	}

}
