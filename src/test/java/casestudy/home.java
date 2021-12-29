package casestudy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class home {
	WebDriver d1;
	public home(WebDriver driver) {
		this.d1 = driver;
	}
	By Login = By.xpath("/html/body/header/div/nav/a[6]");
	public void Visitlink() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mannarapu.ravali\\Downloads\\chromedriver.exe");
		this.d1 = new ChromeDriver();
		this.d1.get("https://phptravels.com/");
	}
	public void clickLogin() {
		d1.findElement(Login).click();
	}
}