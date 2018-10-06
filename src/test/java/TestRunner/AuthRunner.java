package TestRunner;

import java.io.File;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:features/login/login.feature" }, glue = {
		"classpath:Stepdefinition.auth"
		 }, plugin = {"html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt","junit:target/cucumber-results.xml","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-report.html"})
public class AuthRunner extends AbstractTestNGCucumberTests {
	
	@After
    public static void setup() {
        Reporter.loadXMLConfig(new File("C:\\Users\\Admin\\workspace\\bddtrkeye\\extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows OS");
        Reporter.setTestRunnerOutput("Sample test runner output message");
        Reporter.setSystemInfo("environment", "QA");
        Reporter.setSystemInfo("HostName", "Ananth");
	}

}
