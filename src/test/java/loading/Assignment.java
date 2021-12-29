package loading;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
public class Assignment {
	@Test
	public void first_method() throws IOException, AWTException {
		WebDriver d1;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mannarapu.ravali\\Downloads\\chromedriver.exe");
		d1 = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("plugins.always_open_pdf_externally", true);
		options.setExperimentalOption("prefs", prefs);
		d1 = new ChromeDriver(options);
		d1.get("http://www.leafground.com/pages/download.html");
		d1.findElement(By.linkText("Download PDF")).click();
		File filelocation = new File("C:\\Users\\mannarapu.ravali\\Downloads");
		File[] totalfiles = filelocation.listFiles();
		for (File ff : totalfiles) {
		if (ff.getName().equalsIgnoreCase("testleaf.pdf")) {
		System.out.println("File downloaded successfully");
		break;
		 }
		}
	   }
	@Test
	public void second_method() throws AWTException, InterruptedException {
		WebDriver d1;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mannarapu.ravali\\Downloads\\chromedriver.exe");
		d1 = new ChromeDriver();
		d1.get("https://www.ilovepdf.com/word_to_pdf");
		d1.findElement(By.id("pickfiles")).click();
		Thread.sleep(4000);
		String f1 = "C:\\Users\\mannarapu.ravali\\Downloads\\Browser Settings to access the trainings updated (1).docx";
		StringSelection ss = new StringSelection(f1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
	}
}
