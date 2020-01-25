package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="src/test/resources/Features",
		glue = "com.stepdefinition",
		monochrome = true,
		dryRun = false,
		plugin = {"html:target","rerun:src/test/resources/failed.txt"},
		tags = {"@sanity"}
		)

public class TestRunner {
	
	

}
