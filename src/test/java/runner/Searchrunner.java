package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\bhims\\OneDrive\\Desktop\\B35\\cucumber\\src\\test\\resources\\ebayfeatures\\Search.feature",
		glue="cucumber"
		)
public class Searchrunner {

}
