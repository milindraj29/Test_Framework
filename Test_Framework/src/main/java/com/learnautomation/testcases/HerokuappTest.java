package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.Checkboxes;
import com.learnautomation.pages.ContextMenu;
import com.learnautomation.pages.DragandDrop;
import com.learnautomation.pages.Dropdown;
import com.learnautomation.pages.AddRemoveElements;

public class HerokuappTest extends BaseClass {
	
	
	@Test
	public void AddorRemoveElements()
	{
		logger = report.createTest("Add/Remove Elements");
		
		AddRemoveElements AddRemoveElement = PageFactory.initElements(driver, AddRemoveElements.class);
		
		AddRemoveElement.AddRemoveElementsTest();
		
		//logger.info("Starting Application");
		
		//loginPage.LogintoCRM(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		
		//logger.pass("Login Successful");
		
		
	}
	
	@Test
	public void ClickCheckbox()
	{
		logger = report.createTest("Click Checkbox");
		
		Checkboxes check = PageFactory.initElements(driver, Checkboxes.class);
		
		check.CheckboxesTest();	
	}
	
	@Test
	public void ClickContextMenu()
	{
		logger = report.createTest("Right click Context Menu");
		
		ContextMenu rightClick = PageFactory.initElements(driver, ContextMenu.class);
		
		rightClick.ContextMenuTest();	
	}
	
	@Test
	public void DragandDropElement()
	{
		logger = report.createTest("Drag and Drop web elements");
		
		DragandDrop dragDrop = PageFactory.initElements(driver, DragandDrop.class);
		
		dragDrop.DragandDropTest();	
	}
	
	@Test
	public void SelectDropdown()
	{
		logger = report.createTest("Select elements from drop down");
		
		Dropdown dragDrop = PageFactory.initElements(driver, Dropdown.class);
		
		dragDrop.DropdownTest();	
	
	}
}

