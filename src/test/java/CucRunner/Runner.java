package CucRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Prathap\\eclipse-workspace\\Prathap\\Prathap.java\\CoreJava\\SL1\\src\\test\\java\\Feature",
		dryRun = false,
		monochrome = true,
		glue = {"definition"}
		
		
		)
public class Runner {

}
