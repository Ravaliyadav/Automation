package casestudy;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class Logintest {
	WebDriver d1;
	Login l1 = new Login(d1);
	@Test
	public void first_method() throws IOException, InterruptedException {	
	l1.Visitlink();
    l1.Email();
	l1.Password();		
}
}