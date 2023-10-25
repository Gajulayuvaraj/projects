package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target/cucumber_html_report.html"} ,features="src/test/java/Features/Signup.feature", glue="yuvaraj", 
monochrome=true, stepNotifications=true)
public class Runner{
	
	
	
}






