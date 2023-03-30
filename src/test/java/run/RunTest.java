package run;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Clase para correr los test
 * @author ANDRES PINEDA
 *
 */
@Listeners({ExtentITestListenerClassAdapter.class})
@CucumberOptions(features="src/test/java/features/search.feature",glue="steps",
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags="@Buy4")

public class RunTest extends AbstractTestNGCucumberTests {

}