package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddTariffPlan {
	static WebDriver driver;
	
	@Given("user lauches telecom home page")
	public void user_lauches_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prem kumar\\Downloads\\cucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
	  
	   	}

	@Given("User click on add tariff plan button")
	public void user_click_on_add_tariff_plan_button() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	   	}

	@When("user enter all the fields")
	public void user_enter_all_the_fields() {
		driver.findElement(By.id("rental1")).sendKeys("60000");
		driver.findElement(By.id("local_minutes")).sendKeys("5");
		driver.findElement(By.id("inter_minutes")).sendKeys("15");
		driver.findElement(By.id("sms_pack")).sendKeys("600");
		driver.findElement(By.id("minutes_charges")).sendKeys("60");
		driver.findElement(By.id("inter_charges")).sendKeys("60000");
		driver.findElement(By.id("sms_charges")).sendKeys("6");
	   	}

	@When("user click on submitbutton")
	public void user_click_on_submitbutton() {
		driver.findElement(By.name("submit")).click();
	   }

	@Then("User should be displayed success plan")
	public void user_should_be_displayed_success_plan() {
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).isDisplayed());
		
	   }



}
