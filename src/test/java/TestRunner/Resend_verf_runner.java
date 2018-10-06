package TestRunner;

import java.io.File;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "classpath:features/ver_code_resend/login.feature" }, glue = {
		"classpath:Stepdefinition.resend"
		 }, plugin = {"html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt","junit:target/cucumber-results.xml","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-report.html"})
public class Resend_verf_runner extends AbstractTestNGCucumberTests{
	
	
	public static void setup() {
        Reporter.loadXMLConfig(new File("C:\\Users\\Admin\\workspace\\bddtrkeye\\extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OS");
        Reporter.setTestRunnerOutput("Sample test runner output message");
        Reporter.setSystemInfo("environment", "QA");
        Reporter.setSystemInfo("HostName", "Ananth");
	}
}
