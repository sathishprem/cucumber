package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.AddCustomerPage;
import com.objectrepository.AddTariffPlanPage;
import com.objectrepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffPlan extends FunctionalLibrary{
	 HomePage hp=new HomePage();
     AddTariffPlanPage atp=new AddTariffPlanPage();



	

	

	@Given("User click on add tariff plan button")
	public void user_click_on_add_tariff_plan_button() {
		button(hp.getCustomerButton());
		
	   	}

	@When("user enter all the fields")
	public void user_enter_all_the_fields() {
		button(atp.getDonebutton());
		insertText(atp.getRental(), "60000");
		insertText(atp.getLocmin(), "650");
		insertText(atp.getIntmin(), "60");
		insertText(atp.getSmsp(), "65000");
		insertText(atp.getMinchrg(), "750");
		insertText(atp.getIntchrg(), "80");
		insertText(atp.getSmschrg(), "900");

		
		
	   	}
	@When("user enter all the fields with oneD")
	public void user_enter_all_the_fields_with_oneD(DataTable D) {
		List<String> LD = D.asList(String.class);
		driver.findElement(By.id("rental1")).sendKeys(LD.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(LD.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(LD.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(LD.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(LD.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(LD.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(LD.get(6));
	  }

@When("user enter all the fields with oneDM")
public void user_enter_all_the_fields_with_oneDM(DataTable DM) {
	Map<String, String> Dmap = DM.asMap(String.class, String.class);
	driver.findElement(By.id("rental1")).sendKeys(Dmap.get("rental1"));
	driver.findElement(By.id("local_minutes")).sendKeys(Dmap.get("local_minutes"));
	driver.findElement(By.id("inter_minutes")).sendKeys(Dmap.get("inter_minutes"));
	driver.findElement(By.id("sms_pack")).sendKeys(Dmap.get("sms_pack"));
	driver.findElement(By.id("minutes_charges")).sendKeys(Dmap.get("minutes_charges"));
	driver.findElement(By.id("inter_charges")).sendKeys(Dmap.get("inter_charges"));
	driver.findElement(By.id("sms_charges")).sendKeys(Dmap.get("sms_charges"));
	
}
@When("user enter all the fields with twoDL")
public void user_enter_all_the_fields_with_twoDL(DataTable TDL) {
	List<List<String>> TDLi= TDL.asLists(String.class);
	driver.findElement(By.id("rental1")).sendKeys(TDLi.get(0).get(0));
	driver.findElement(By.id("local_minutes")).sendKeys(TDLi.get(1).get(1));
	driver.findElement(By.id("inter_minutes")).sendKeys(TDLi.get(2).get(2));
	driver.findElement(By.id("sms_pack")).sendKeys(TDLi.get(1).get(4));
	driver.findElement(By.id("minutes_charges")).sendKeys(TDLi.get(2).get(3));
	driver.findElement(By.id("inter_charges")).sendKeys(TDLi.get(2).get(6));
	driver.findElement(By.id("sms_charges")).sendKeys(TDLi.get(1).get(6));
	
	
}

@When("user enter all the fields {string},{string},{string},{string},{string},{string},{string}")
public void user_enter_all_the_fields(String ren, String loc, String inte, String sms, String min, String intch, String smsch) {

	driver.findElement(By.id("rental1")).sendKeys(ren);
	driver.findElement(By.id("local_minutes")).sendKeys(loc);
	driver.findElement(By.id("inter_minutes")).sendKeys(inte);
	driver.findElement(By.id("sms_pack")).sendKeys(sms);
	driver.findElement(By.id("minutes_charges")).sendKeys(min);
	driver.findElement(By.id("inter_charges")).sendKeys(intch);
	driver.findElement(By.id("sms_charges")).sendKeys(smsch);
	
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
