package am.qa.onex.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.qa.onex.page.base.PageObject;
import am.qa.onex.page.login.OnexLoginPage;
import am.qa.onex.page.register.OnexRegisterPage;

public class OnexHomePage extends PageObject {

	// es mer constructorn a
	public OnexHomePage(WebDriver driver) {
		super(driver); // sa mer parent classi, aysinqn PageObjecti constructori kanchn a

	}

	@FindBy(xpath = "//a[@href='/user/login']")
	WebElement loginButton;

	@FindBy(xpath="//ul[@class='dropdown-menu']//a[contains(@href, 'importrussia')]")
	WebElement importing;
	
	@FindBy(xpath="//div[@id='footerlg']//ul[@class='nav navbar-nav']")
	WebElement language;
	
	@FindBy(xpath="//div[@id='footerlg']//a[contains(@href, 'ru')]")
	WebElement languageRu;
	
	public OnexHomePage openLanguageDropDown() {
		language.click();
		return new OnexHomePage(driver);
	}
	
	public OnexHomePage changeLanguageRu() {
		languageRu.click();
		return new OnexHomePage(driver);
	}
	
	

	// openLoginPage() method e
	// page object tesaki class-erum, method@ da gorcoghutyun e ayd ejum
	// orinak - Home page-um bacel login-i ej@, vorn arvum e login-i kojakin
	// seghmelov
	// ayn veradardznum e mez LoginPage-i object ->> new OnexLoginPage(driver);
	public OnexLoginPage openLoginPage() {
		loginButton.click();
		return new OnexLoginPage(driver);
	}

	@FindBy(xpath = "//a [@href='/user/register']")
	WebElement registerButton;
	public Object onexLoginPage;

	public OnexRegisterPage openRegisterPage() {
		registerButton.click();
		return new OnexRegisterPage(driver);
	}

	public void navigateToImportingFromRus() {
		// petq a sra marmin@ grel u xpath-ov web element@ sarqel

	}

	public void navigateToShipFromRussia() {

	}

}
