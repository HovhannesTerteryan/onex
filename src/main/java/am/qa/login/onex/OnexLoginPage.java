package am.qa.login.onex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.onex.member.area.page.OnexMemberArea;
import am.qa.onex.page.base.PageObject;

public class OnexLoginPage extends PageObject {

	public OnexLoginPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//input[@name='LoginForm[username]']")
	static
	WebElement usernameField;
	
	public static void fillUserName(String username) {
		usernameField.sendKeys(username);
	}
	
	@FindBy(xpath="//input[@name='LoginForm[password]']")
	static
	WebElement passwordField;
	
	public static void fillPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	@FindBy(xpath="//input[@id='loginform-rememberme']")
	WebElement chekboxRememberMe;
	
	public void RememberMe() {
	chekboxRememberMe.click();
    }
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitLogin;
	
	public OnexMemberArea submitLoginForm() {
		submitLogin.submit();
		return new OnexMemberArea(driver);
		}

	
	public PageObject doLogin(String username, String password) {
		fillUserName(username);
		fillPassword(password);
		submitLoginForm();
		return new PageObject(driver);
	}
	public OnexMemberArea openMemberArea() {
		return new OnexMemberArea(driver);
	}

	
	
}


