package com.objectrepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AddTariffPlanPage extends FunctionalLibrary{
	public AddTariffPlanPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement donebutton;
	@FindBy(id="rental1")
	private WebElement rental;
	@FindBy(id="local_minutes")
	private WebElement locmin;
	@FindBy(id="inter_minutes")
	private WebElement intmin;
	@FindBy(id="sms_pack")
	private WebElement smsp;
	@FindBy(id="minutes_charges")
	private WebElement minchrg;
	@FindBy(id="inter_charges")
	private WebElement intchrg;
	@FindBy(id="sms_charges")
	private WebElement smschrg;
	public WebElement getDonebutton() {
		return donebutton;
	}
	public WebElement getRental() {
		return rental;
	}
	public WebElement getLocmin() {
		return locmin;
	}
	public WebElement getIntmin() {
		return intmin;
	}
	public WebElement getSmsp() {
		return smsp;
	}
	public WebElement getMinchrg() {
		return minchrg;
	}
	public WebElement getIntchrg() {
		return intchrg;
	}
	public WebElement getSmschrg() {
		return smschrg;
	}



	



	

	
	
	

}
