package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin={"html:target/cucumber_html_report.html"} ,features="src/test/java/Features/edurekha.feature", glue="yuvaraj", 
monochrome=true, dryRun=true)
public class TestNgTestRunner  extends AbstractTestNGCucumberTests{
	

}
