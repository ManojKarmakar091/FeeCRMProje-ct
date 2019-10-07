package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class DealsPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	DealsPage dealspage;
	
	public DealsPageTest(){
		super();
	}
	
	
@BeforeMethod
public void verifyDealsLebel(){
	
	initialization();
	 loginpage = new LoginPage();
	 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	 dealspage= homepage.clickOnDealsLink();
}

@Test
public void verifyDealsLabelTest(){
	
	Assert.assertTrue(dealspage.verifyDealsPageLabel());
	
}


	
@AfterMethod
public void tearDown(){
	
	driver.close();
}
	
}
