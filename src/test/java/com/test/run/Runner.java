package com.test.run;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "/Users/sattautsho/eclipse-workspace/test/src/main/resources/Login.feature", // Path to your
																											// feature
																											// files
		glue = "com.cucumber.bdd", // Path to your step def package
		plugin = { "json:target/cucumber-reports/cucumber.json" }, // report plugins
		monochrome = true // Readable console output
)
public class Runner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true) // optional:For parallel execution of scenerios
	public Object[][] scenarios() {

		return super.scenarios();
	}

}
