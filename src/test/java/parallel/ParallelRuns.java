package parallel;


import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/parallel"},
			//	features = {"src/test/resources/parallel/DressTypes.feature"},
	//		tags="not  @Account",
		glue = {"parallel"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:target/failedrerun.txt"
		
		},
		monochrome =true
		
		)

public class ParallelRuns extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel= true)
	public Object[][] scenarios(){
		
		return super.scenarios();
	}
	
	

}
