package casestudy;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class hometest {
	WebDriver d1;
	home h1 = new home(d1);
	@Test
	public void first_method() throws IOException, InterruptedException {
		h1.Visitlink();
		h1.clickLogin();
	}
}
