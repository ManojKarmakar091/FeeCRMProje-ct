package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CompaniesPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class CompaniesPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	CompaniesPage companiespage;
	
	
	
	public 	CompaniesPageTest(){
		
		super();
	}
		
		
	@BeforeMethod
	public void setUp(){
		
	initialization();	
	 loginpage = new LoginPage();
	 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	 companiespage= homepage.clickOnCompanieslink();
	}
	
	@Test
	public void verifyCompaniesLevelTest(){
		
	Assert.assertTrue(companiespage.verifyCompaniesLebelTest(), "Companies lavel is not matched");
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.close();
}
}