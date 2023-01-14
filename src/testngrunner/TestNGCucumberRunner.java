package testngrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
features = "D:\\Testing Ducat\\Automation Projects\\RipurajMavenCucumber\\SeleniumAutomation\\src\\featurefiles\\LoginTestCases.feature",
glue = "stepsdefination",
tags = "@validTC1"
)
public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {

}
