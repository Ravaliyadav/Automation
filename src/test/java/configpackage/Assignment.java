package configpackage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Assignment {
	WebDriver driver;
	public WebDriver driverCheck(String browser, String path, WebDriver driver) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", path);
			driver = new FirefoxDriver();
		}
		return driver;
	}
	@Test
	public void first_method() throws IOException {
		FileInputStream st = new FileInputStream("config.properties");
		Properties prop = new Properties();
		prop.load(st);
		String browser = prop.getProperty("browser_name");
		String path = prop.getProperty("browser_driver_path");
		driver = driverCheck(browser, path, driver);
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		File f = new File("C:\\Users\\mannarapu.ravali\\Downloads\\cookie.data");

		try {
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			Cookie cname = new Cookie("myCookie", "12345678999");
			driver.manage().addCookie(cname);
			for (Cookie ck : driver.manage().getCookies()) {
				bw.write((ck.getName() + ":" + ck.getDomain() + ";" + ck.getPath() + ";" + ck.getValue() + ";"
						+ ck.isSecure() + ";" + ck.getExpiry()));
				bw.newLine();
			}
			driver.manage().deleteCookie(cname);
			bw.close();
		    fw.close();
		}
		catch (Exception e) {
	    System.out.println(e);
		}
}
}
