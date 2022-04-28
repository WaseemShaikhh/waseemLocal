package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
features= {"src/test/resources/Features/expertronsweb.feature"},
glue= {"StepDefinition"},
plugin= {"html:target/cucumber-html-report"},
monochrome=true

)

public class Runner extends AbstractTestNGCucumberTests {

}