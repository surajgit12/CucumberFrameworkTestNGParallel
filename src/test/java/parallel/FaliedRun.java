package parallel;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"@target/failedrerun.txt"},
		glue = {"parallel"},
		plugin = {"pretty",
				"rerun:target/failedrerun.txt"
		
		},
		monochrome =true
		
		)
public class FaliedRun  extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel= true)
	
	
	public Object[][] scenarios() {
		
		return super.scenarios();
	}
	
}
