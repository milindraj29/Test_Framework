package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkboxes {

	WebDriver driver;
	
	public Checkboxes(WebDriver driver)
	{
		this.driver = driver;
	}
	
@FindBy(linkText= "Checkboxes" )WebElement Checkboxes;
@FindBy(css="input:nth-child(1)")WebElement Checkbox1;
@FindBy(css="input:nth-child(3)")WebElement Checkbox2;

	public void CheckboxesTest()
	{
		
		Checkboxes.click();
		Checkbox1.click();
		Checkbox2.click();
		Checkbox2.click();
	}

}


