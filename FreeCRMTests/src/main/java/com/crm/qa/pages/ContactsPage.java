package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement contactsLabel;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='middle_name']")
	WebElement middleName;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement saveButton;
	
	
	
	
	public ContactsPage(){
		
	PageFactory.initElements(driver, this);
			
	}
	
	public boolean verifyContactLebel(){
		
	return	contactsLabel.isDisplayed();
	}
	
	
	public void createNewContact(String ftName, String mdName, String ltName){
		
		firstName.sendKeys(ftName);
		middleName.sendKeys(mdName);
		lastName.sendKeys(ltName);
		saveButton.click();
		
	}

}
