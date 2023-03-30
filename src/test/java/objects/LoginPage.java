package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Esta clase se encuentra la "logica" del proyecto, esta ordenado que metodos cambiar si 
 * en algun momento falla el proyecto 
 * @author ANDRES PINEDA
 *
 */

public class LoginPage {
	
	
	
	WebDriver driver;
	
	String url= ("https://www.saucedemo.com/");
	By name= By.xpath("//input[@id='user-name']");
	By password= By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@id='login-button']");
	By selectone = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By selecttwo = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	By selectcar = By.xpath("//div[@id='shopping_cart_container']/a");
	By selectcheckout = By.xpath("//button[@id='checkout']");
	By names = By.xpath("//input[@id='first-name']");
	By lastname = By.xpath("//input[@id='last-name']");
	By zip = By.xpath("//input[@id='postal-code']");
	By continues = By.xpath("//input[@id='continue']");
	By finish = By.id("finish");
	By remove = By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]");
	By remove2= By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");
	By back= By.xpath("//*[@id=\"continue-shopping\"]");
	By selectones= By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
	By removeones= By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]");
	By cancel = By.xpath("//*[@id=\"cancel\"]");
	
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// Metodo para entrar a la pagina web
	
	public void enterWeb() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		
		
	}
	
	//Metodo login
	
	public void enterLogin()
	{
		
		
		driver.findElement(name).sendKeys("standard_user");
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(login).click();
		
	}

	//Metodo Seleccionar 2 productos
	
	public void selectTwoProducts() throws InterruptedException
	{
		
		
		Thread.sleep(6000);
		driver.findElement(selectone).click();
		Thread.sleep(5000);
		driver.findElement(selecttwo).click();
		Thread.sleep(5000);
		
		
		
		
		
	}
	
	//Metodo Seleccionar Carrito
	
	public void selectCart() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.findElement(selectcar).click();
		Thread.sleep(5000);
		driver.findElement(selectcheckout).click();
				
	}
	
	
	//Metodo para remover los productos
	
	public void removeProducts() throws InterruptedException
	{
		
		driver.findElement(selectcar).click();
		Thread.sleep(6000);
		driver.findElement(remove).click();
		Thread.sleep(6000);
		driver.findElement(remove2).click();
		Thread.sleep(6000);
		driver.findElement(back);
	}
	
	
	//Metodo para remover un producto
	
	public void removeProductsone() throws InterruptedException
	
	{
		driver.findElement(selectones).click();
		Thread.sleep(6000);
		driver.findElement(removeones).click();
		Thread.sleep(6000);		
		
	}
	
	//Metodo para diligenciar formulario
	
	public void completeForm() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.findElement(names).sendKeys("Andres");;
		Thread.sleep(1000);
		driver.findElement(lastname).sendKeys("Pineda");
		Thread.sleep(1000);
		driver.findElement(zip).sendKeys("110111");
		Thread.sleep(1000);
		driver.findElement(continues).click();
		
	}
	
	//Metodo para finalizar la compra 
	
	public void clickFinish() throws InterruptedException
	{
		
		Thread.sleep(6000);
		driver.findElement(finish).click();
		Thread.sleep(4000);
		
				
	}
	
	// Metodo para cancelar la orden
	
	public void clickCancel() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.findElement(cancel).click();
		Thread.sleep(6000);
	}
	
	//Metodo para cerrar el navegador
	
	public void closeWindow() throws InterruptedException
	{
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}
	
	
	
	
	
}