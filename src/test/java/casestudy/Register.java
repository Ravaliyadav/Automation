package casestudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Register {
	WebDriver d1;
	public Register(WebDriver driver) {
		this.d1 = driver;
	}
	By Register = By.linkText("Register");
	By Firstname = By.name("firstname");
	By Lastname = By.name("lastname");
	By Email = By.id("inputEmail");
	By Phonenumber = By.xpath("//*[@id=\"containerNewUserSignup\"]/div[1]/div[2]/div/div[4]/div/div/div/div/div[2]");
	By Choosecountry = By.xpath("//*[@id=\"containerNewUserSignup\"]/div[1]/div[2]/div/div[4]/div/div/div/ul/li[102]/span[1]");
	By IP = By.name("phonenumber");
	By Companyname = By.name("companyname");
	By Address1 = By.name("address1");
	By Address2 = By.name("address2");
	By City = By.name("city");
	By State = By.name("state");
	By Postcode = By.name("postcode");
	By Country = By.name("country");
	By Customfield = By.name("customfield[2]");
	By Password = By.name("password");
	By Password2 = By.name("password2");
	public void Visitlink() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mannarapu.ravali\\Downloads\\chromedriver.exe");
		this.d1 = new ChromeDriver();
		this.d1.get("https://phptravels.org/index.php?rp=/login");
	}
	public void clickRegister() {
		this.d1.findElement(Register).click();
	}
	public void Fname() {
		this.d1.findElement(Firstname).sendKeys("Ravali");
	}
	public void Lname() {
		this.d1.findElement(Lastname).sendKeys("Yadav");
	}
	public void Mail() {
		this.d1.findElement(Email).sendKeys("mannarapuravali@gmail.com");
	}
	public void Pn() {
		this.d1.findElement(Phonenumber).click();
	}
	public void ip() {
		this.d1.findElement(IP).sendKeys("9550303563");
	}
	public void Cn() {
		this.d1.findElement(Companyname).sendKeys("HCL");
	}
	public void Ad1() {
		this.d1.findElement(Address1).sendKeys("gollapalem street,yellayapalem village,nellore");
	}
	public void Ad2() {
		this.d1.findElement(Address2).sendKeys("anjaneyaswami temple street,kovur");
	}
	public void C() {
		this.d1.findElement(City).sendKeys("Nellore");
	}
	public void S() {
		this.d1.findElement(State).sendKeys("Andhra Pradesh");
	}
	public void Pc() {
		this.d1.findElement(Postcode).sendKeys("524366");
	}
	public void Cy() {
		this.d1.findElement(Country).sendKeys("India");
	}
	public void CF() {
		this.d1.findElement(Customfield).sendKeys("9550303563");
	}
	public void P1() {
		this.d1.findElement(Password).sendKeys("Sudha$aila@25");
	}
	public void P2() {
		this.d1.findElement(Password2).sendKeys("Sudha$aila@25");
	}
	public void countrycode() {
		this.d1.findElement(Choosecountry).click();
	}
}
