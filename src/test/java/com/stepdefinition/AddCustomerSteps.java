package com.stepdefinition;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps {
	
	static WebDriver driver;
	
	@Given("User launches telecom home page")
	public void user_launches_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem kumar\\Downloads\\cucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
	  
	}

	@Given("User click on add customer button")
	public void user_click_on_add_customer_button() {
	    
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		
	}

	@When("User enters all the fields")
	public void user_enters_all_the_fields() {
		
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("java");
		driver.findElement(By.id("lname")).sendKeys("selenium");
		driver.findElement(By.id("email")).sendKeys("java@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("thoraipakkam");
		driver.findElement(By.id("telephoneno")).sendKeys("123456789");
		
	  
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		
		driver.findElement(By.name("submit")).click();
	 
	}

	@Then("User should be displayed customer id")
	public void user_should_be_displayed_customer_id() {
		
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	
	}

}
