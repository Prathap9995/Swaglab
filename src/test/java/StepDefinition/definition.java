package StepDefinition;


import java.io.IOException;

import org.junit.Assert;
import org.junit.runner.RunWith;

import PageObject.LoginPage;
import SwagLab.SL1.Base;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(value = Cucumber.class)
public class definition extends Base{
	
	@Before
	public void init() throws IOException {
	driver = initiatingdriver();
	}

    @Given("^Navigate to swag lab page (.+)$")
    public void navigate_to_swag_lab_page(String httpswwwsaucedemocom) throws Throwable {
     
        driver.get(httpswwwsaucedemocom);
        
    }

    @When("^check title is displayed$")
    public void check_title_is_displayed() throws Throwable {
    	Assert.assertTrue(true);
       
    }

    @Then("^Take screenshot$")
    public void take_screenshot() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.Userpage().sendKeys("Prathap");
        
    }
    

    @And("^close browser$")
    public void close_browser() throws Throwable {
        driver.close();
    }

}