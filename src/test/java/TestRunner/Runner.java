package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFile",
glue="StepDefinition",tags={"@tag1"},
monochrome=true,plugin=
{"com.cucumber.listener.ExtentCucumberFormatter:Reports/report.html",
		"pretty", "html:target/cucumber-reports"})
public class Runner {

}
