package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CompaniesPage extends TestBase {
	
	
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement companiesLavel;
	
	
	public CompaniesPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyCompaniesLebelTest(){
		
		return companiesLavel.isDisplayed();
		
	}
	

}
