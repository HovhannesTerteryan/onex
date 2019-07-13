package am.qa.onex.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class OnexTestBase {
	protected WebDriver driver;

	@BeforeClass
	@Parameters({ "driverName", "driverPath" })
	public void testPreparation(String driverName, String driverPath) {
		System.out.println("This is my Onex test");
		System.setProperty(driverName, driverPath);

		if (driverName.contains("chrome")) {
			driver = new ChromeDriver();
		} else if (driverName.contains("geko")) {
			driver = new FirefoxDriver();
		} else {
			driver = new InternetExplorerDriver();
		}
		driver.get("https://onex.am/");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
