package cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class )
@CucumberOptions(features="/maven/src/test/java/feature",glue="stepDefination",tags="")
public class TestRunner {

}
