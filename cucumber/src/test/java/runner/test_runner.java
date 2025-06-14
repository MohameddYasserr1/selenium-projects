// el code da 3shan a run features kolaha mara wa7da 3shan lw 3awz a3ml repor
package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        glue = "step_definition",
        plugin = {"esm el report","html:target/TestReport.html"} ,
        tags = "@smoke" // da el esm el test el b3mlo fa ay test fl features gwah @smoke hy run
)


public class test_runner extends AbstractTestNGCucumberTests { //el extend da el by run
}
