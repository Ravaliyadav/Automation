package casestudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
	WebDriver d1;
	public Login(WebDriver driver) {
		this.d1 = driver;
	}
	By email = By.name("username");
	By password = By.name("password");
	public void Visitlink() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mannarapu.ravali\\Downloads\\chromedriver.exe");
		this.d1 = new ChromeDriver();
		this.d1.get("https://phptravels.org/login");
	}
	public void Email() {
		this.d1.findElement(email).sendKeys("mannarapuravali@gmail.com");
	}
	public void Password() {
		this.d1.findElement(password).sendKeys("Sudha$aila@25");
	}
}
