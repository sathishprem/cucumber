package com.stepdefinition;



import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.AddCustomerPage;
import com.objectrepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerSteps extends FunctionalLibrary {
	
            HomePage hp=new HomePage();
            AddCustomerPage acp=new AddCustomerPage();
	


	@Given("User click on add customer button")
	public void user_click_on_add_customer_button() {
	    
		button(hp.getCustomerButton());

		
	}

	@When("User enters all the fields")
	public void user_enters_all_the_fields() {
		
         button(acp.getDoneButton());
         insertText(acp.getFirstName(), "karthi");
         insertText(acp.getLastName(), "rajan");
         insertText(acp.getMail(), "kkk@gmail.com");
         insertText(acp.getAddress(), "tanjore");
         insertText(acp.getPhno(), "12553336665");
		
	  
	}
	
	@When("User enters all the field with oneDim")
	public void user_enters_all_the_field_with_oneDim(DataTable datas) {
		
		List<String> cusData = datas.asList(String.class);
		
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		insertText(acp.getFirstName(), cusData.get(0));
		driver.findElement(By.id("lname")).sendKeys(cusData.get(1));
		driver.findElement(By.id("email")).sendKeys(cusData.get(2));
		driver.findElement(By.name("addr")).sendKeys(cusData.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(cusData.get(4));
		

	}
	
	@When("User enters all the field with oneDimMap")
	public void user_enters_all_the_field_with_oneDimMap(DataTable datas) {
		
		Map<String, String> cusData = datas.asMap(String.class, String.class);
		
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(cusData.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(cusData.get("lname"));
		driver.findElement(By.id("email")).sendKeys(cusData.get("mail"));
		driver.findElement(By.name("addr")).sendKeys(cusData.get("addr"));
		driver.findElement(By.id("telephoneno")).sendKeys(cusData.get("phno"));
		

	}
	
	@When("User enters all the field with twoDim")
	public void user_enters_all_the_field_with_twoDim(DataTable datas) {
		
         List<List<String>> cusData = datas.asLists(String.class);
         
         ////label[text()='Done']
		
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(cusData.get(2).get(0));
		driver.findElement(By.id("lname")).sendKeys(cusData.get(1).get(1));
		driver.findElement(By.id("email")).sendKeys(cusData.get(3).get(2));
		driver.findElement(By.name("addr")).sendKeys(cusData.get(0).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(cusData.get(2).get(4));
		

	}
	
	@When("User enters all the field with twoDimMap")
	public void user_enters_all_the_field_with_twoDimMap(DataTable datas) {
		
        List<Map<String, String>> cusData = datas.asMaps(String.class,String.class);
		
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(cusData.get(1).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(cusData.get(1).get("lname"));
		driver.findElement(By.id("email")).sendKeys(cusData.get(3).get("email"));
		driver.findElement(By.name("addr")).sendKeys(cusData.get(0).get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(cusData.get(2).get("phno"));
		

	}


	@When("User click on submit button")
	public void user_click_on_submit_button() {
		
           button(acp.getSubmitButton());

	 
	}

	@Then("User should be displayed customer id")
	public void user_should_be_displayed_customer_id() {
		
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	
	}

}
