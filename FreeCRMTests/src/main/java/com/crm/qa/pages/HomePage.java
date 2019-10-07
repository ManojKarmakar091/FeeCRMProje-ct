package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[@class='user-display']")
	WebElement usernameLabel;

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactLink;

	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath= "//span[contains(text(),'Companies')]")
	WebElement comapnieslink;
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement createNewLink;

	// Initialization

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	// Actions

	public String verifyHomePageTitle() {

		return driver.getTitle();

	}

	public ContactsPage clickOnContactLink() {

		contactLink.click();

		return new ContactsPage();

	}

	public boolean verifyUserName(){
		
		return usernameLabel.isDisplayed(); 
	}
	
	
	public DealsPage clickOnDealsLink() {

		dealsLink.click();

		return new DealsPage();
	}
	
	public CompaniesPage clickOnCompanieslink(){
		
		comapnieslink.click();
		
		return new CompaniesPage();
	}
	
	public ContactsPage clickOnNewCreateContactLink(){
		
		 createNewLink.click(); 
		 
		 return new ContactsPage();
	}

}
