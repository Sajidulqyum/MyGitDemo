package stepDefination;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestSetup;

public class Hooks {
	
	TestSetup testset;
	public Hooks(TestSetup testset) {
		this.testset = testset;
	}
	@After
	public void AfterScenario() {
		testset.testbase.webdrivermanager().quit();
	}
	
	@AfterStep
	public void AddScreeshot(Scenario scenario) throws IOException {
		WebDriver driver = testset.testbase.webdrivermanager();
		if(scenario.isFailed()) {
			File sourcepath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent = FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(filecontent, "image/png", "image");
		}
	}
}
