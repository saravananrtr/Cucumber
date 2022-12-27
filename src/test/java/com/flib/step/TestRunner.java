package com.flib.step;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Windows 11\\eclipse-workspace\\Cucumber-new\\src\\test\\resources\\Features\\Tv.feature", 
				 glue = "com.flib.step",
				 plugin = {"html:target","json:target/reports.json"},
				 monochrome = true,
				 dryRun = false,
				 strict=true)
public class TestRunner {
	

}
