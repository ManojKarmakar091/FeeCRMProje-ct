package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase{
LoginPage loginpage;
HomePage homepage;
ContactsPage contactpage;

	
public 	ContactsPageTest(){
	
	super();
}
	
	
@BeforeMethod
public void setUp(){
	
initialization();	
 loginpage = new LoginPage();
 homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
 contactpage= homepage.clickOnContactLink();
 
}
	
@Test
public void verifyContactLabelTest(){
	
Assert.assertTrue(contactpage.verifyContactLebel(), "Lebel is not matched");
	
}

@Test
public void validateCreateNewContactTest(){
contactpage= homepage.clickOnNewCreateContactLink();
contactpage.createNewContact("a", "b", "c");


	
}


	
@AfterMethod
public void tearDown(){
	
	driver.close();
}	

}
