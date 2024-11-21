package testcases;

import base.ProjectSpecificMethod;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/main/java/feature"},
		glue="pages",
		publish=true,
		monochrome=true,
		tags="not @smoke")
public class RunnerCucumber extends ProjectSpecificMethod {

}
