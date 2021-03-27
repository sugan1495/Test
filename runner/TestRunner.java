package runner;


import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Created by Karthik on 21/09/2019.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"} , 
                 plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
                 tags = {"@Provide_listTitle"},
                 glue = "stepDefinition")
public class TestRunner  {
	public static void main(){
		JUnitCore.main("runner.TestRunner");
	}

}

   
