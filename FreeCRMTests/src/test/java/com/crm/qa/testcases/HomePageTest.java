package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactpage;
	public HomePageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
	initialization();
	 loginpage = new LoginPage();
	 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	 
	}
	
	@Test
	public void verifyHomePageTitleTest(){
		String homePageTitle = homepage.verifyHomePageTitle();
	    Assert.assertEquals(homePageTitle, "Cogmento CRM", "Title is not matched");
		
	}

	@Test
	public void verifyUserNameTest(){
		Boolean bol = homepage.verifyUserName();
		
	Assert.assertTrue(bol);
		
	}
	
	@Test
	public void clickOnContactLinklTest(){
		
		contactpage = homepage.clickOnContactLink();
	
		
		
	}
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		
		driver.close();
	}

}
