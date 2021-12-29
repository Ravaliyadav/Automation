package stepDefn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Script1 {
public static WebDriver d1;
@Given("Open chrome browser and url")
	public void open_chrome_browser_and_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mannarapu.ravali\\Downloads\\chromedriver.exe");
		d1 = new ChromeDriver();
		d1.get("https://phptravels.org/index.php?rp=/login");
	}
@When("Enter all mandatory fields")
public void enter_allmandatoryfields() {
		d1.findElement( By.linkText("Register")).click();
		d1.findElement(By.linkText("Firstname")).sendKeys("Ravali");
		d1.findElement(By.linkText("Lastname")).sendKeys("Yadav");
		d1.findElement(By.name("email")).sendKeys("mannarapuravali@gmail.com");
	    d1.findElement(By.linkText("Phonenumber")).click();
	    d1.findElement(By.linkText("IP")).sendKeys("9550303563");
	    d1.findElement(By.linkText("Companyname")).sendKeys("HCL");
	    d1.findElement(By.linkText("Address1")).sendKeys("gollapalem street,yellayapalem village,nellore");
	    d1.findElement(By.linkText("Address2")).sendKeys("anjaneyaswami temple street,kovur");
	    d1.findElement(By.linkText("City")).sendKeys("Nellore");
	    d1.findElement(By.linkText("State")).sendKeys("Andhra Pradesh");
	    d1.findElement(By.linkText("Postcode")).sendKeys("524366");
	    d1.findElement(By.linkText("Country")).sendKeys("India");
	    d1.findElement(By.linkText("Customfield")).sendKeys("9550303563");
	    d1.findElement(By.name("password")).sendKeys("Sudha$aila@25");	
	    d1.findElement(By.name("password2")).sendKeys("Sudha$aila@25");	
	    d1.findElement(By.linkText("ChooseCountry")).click();
	    
	}
	@Then("Regiester Successfully")
	public void Registered_Successfully() throws InterruptedException {
	System.out.println("Registered in Successfully");
	}
    @Given("Details are Registered")
    public void Details_are_Registered() throws InterruptedException{
System.out.println("Details are Registered");	
}
@When("Enter Email and Password") public void enter_Email_and_Password(){

	d1.findElement(By.name("email")).sendKeys("mannarapuravali@gmail.com");
	d1.findElement(By.name("password")).sendKeys("Sudha$aila@25");	
	}
@Then("Login Successfully")
public void login_Successfully() throws InterruptedException {
	System.out.println("Login Successfully");
}
@Given("Opens the dashboard")
	public void Opens_the_dashboard(){
	System.out.println("Opens the dashboard");
	}
	@When("View cart is clicked")
	public void View_cart() {
		System.out.println("View cart is clicked");
	}
	@Then("Registered  details are displayed")
	public void Registered_details_displayed() {
	System.out.println("Registered details are displayed");
	}
}