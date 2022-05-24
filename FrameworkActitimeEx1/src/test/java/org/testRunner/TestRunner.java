package org.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/org/features"},
		glue= {"stepDefinitions"},
		monochrome=true,
		plugin= {"pretty","html:target/html_reports/report.html","junit:target/junit_report/junit_reports.xml",
				"json:target/json_report/json_reports.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun=false,
		stepNotifications=true
		)
public class TestRunner {

	
}
