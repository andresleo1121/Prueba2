package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.LoginPage;

/**
 * Clase donde estan todos los paso a paso de los test, se conecta con los features
 * @author MSI
 *
 */

public class SearchSteps {
	
	WebDriver driver;
	LoginPage loginPage = new LoginPage(driver);
	
	
	@Given("The user enters the swaglabs page")
	public void theUserIsInIndexPage() throws InterruptedException
	{
		
		loginPage.enterWeb();
		
	}
	
	@When("the user enters name and password")
	public void userEnterDressesInSearchBar()
	{
				
		loginPage.enterLogin();
		
	}
	
		
	
	@Then("Select two products")
	public void userTwoProducts() throws InterruptedException
	{
		
		loginPage.selectTwoProducts();
				
	}
	
	@Then("Select cart")
	public void userSelectCart() throws InterruptedException
	{
		loginPage.selectCart();
		
	}
	
	@Then("Fill Out Form")
	public void userFillOutForm() throws InterruptedException
	{
		
		loginPage.completeForm();
				
	}
	
	@Then("Click Finish")
	public void userSelectBrand() throws InterruptedException
	{
		loginPage.clickFinish();
		
	}
	
	
	@And("End")
	public void userSelectEnd() throws InterruptedException
	{
		loginPage.closeWindow();
		
	}
	
	@Then("Remove products")
	public void removeProducts() throws InterruptedException
	{
		loginPage.removeProducts();
	}

	@Then ("Remove one products")
	public void removeProductsone () throws InterruptedException
	{
		loginPage.removeProductsone();
	}
	
	@Then ("Cancel the order")
	public void cancelOrder() throws InterruptedException
	{
		loginPage.clickCancel();
	}
}