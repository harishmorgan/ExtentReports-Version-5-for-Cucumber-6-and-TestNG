package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
  
@CucumberOptions(tags = "", features = "src/test/resources/features/LoginPage.feature", glue = "stepDef",
                 plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
  
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
  
}