package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Swathi\\eclipse-workspace\\"
				+ "com.CucumberFramework.org\\src\\test\\resources\\"
				+ "features\\datatableExample2.feature",
		stepNotifications = true,
		dryRun = false,
		glue = {"stepDefinatons"},
		monochrome = true,
		plugin = {"pretty", "html:test-output\\cucumber-report.html"}
		

)

public class TestRunner {

}
