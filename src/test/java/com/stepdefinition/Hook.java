package com.stepdefinition;

import com.resources.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends FunctionalLibrary {
	
	@Before
	public void beforeBackground() {
		
		launchUrl("http://demo.guru99.com/telecom/index.html");
		
	}
	
	
	@After
	public void browserQuit() {
		driver.close();

	}
	

}
