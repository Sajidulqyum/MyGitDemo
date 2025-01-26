package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepDefination",monochrome=true,
				tags="@checkoutproducts or @searchandplaceproducts ",
				plugin= {"html:target/cucumber.html",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"rerun:target/failed_scenarios.txt"})
public class TestRunnerFile extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
    public Object[][] scenarios() {
       
        return super.scenarios();
    }
}
