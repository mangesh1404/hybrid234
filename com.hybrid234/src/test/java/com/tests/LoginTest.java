package com.tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.DashboardPage;
import com.pages.LoginPage;

public class LoginTest extends BaseClass{

	LoginPage lp=null;
	DashboardPage dp =null;
	
	@BeforeSuite
	public void setup() {
		intilization();
		reportInit();
		lp = new LoginPage(driver);
	}
	@Test
	public void test01() {
		dp= lp.validLogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard1");
	}
	@Test
	public void test02() {
		List<String>courses = dp.getAllCourses();
		System.out.println(courses);	
	}
}
