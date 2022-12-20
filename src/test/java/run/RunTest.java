package run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Clase para correr los test
 * @author ANDRES PINEDA
 *
 */

@CucumberOptions(features="src/test/java/features/search.feature",glue="steps",
plugin={"pretty","html:target/reports.html"},tags="@Categories")

public class RunTest extends AbstractTestNGCucumberTests {

}