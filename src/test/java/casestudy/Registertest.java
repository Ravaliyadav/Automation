package casestudy;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class Registertest {
	WebDriver d1;
	Register reg = new Register(d1);
	@Test
	public void first_method() throws IOException, InterruptedException {
	reg.Visitlink();
	reg.clickRegister();
		reg.Pn();
		reg.countrycode();
		reg.Fname();
		reg.Lname();
		reg.Mail();
		reg.Cn();
		reg.Ad1();
		reg.Ad2();
		reg.C();
		reg.S();
		reg.Pc();
		reg.Cy();
		reg.CF();
		reg.P1();
		reg.P2();
		reg.ip();
}
}