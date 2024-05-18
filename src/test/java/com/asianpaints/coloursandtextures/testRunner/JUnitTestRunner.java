package com.asianpaints.coloursandtextures.testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		junit = "--step-notifications",
		features = "features",
		glue = "com.asianpaints.coloursandtextures.stepDefinitions",
		plugin = { "pretty",
				"json:resources/Cucumber.json",
				"junit:resources/Cucumber.xml",
		"html:resources/Cucumber.html" },
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		monochrome = true,
		tags = {"@2200_Colour"}
		)



public class JUnitTestRunner
{



}
