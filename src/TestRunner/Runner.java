package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="Features/Login.feature", 
glue={"StepDefinition"})
//Login, DragAndDrop
//nothing goes here
public class Runner {



}
