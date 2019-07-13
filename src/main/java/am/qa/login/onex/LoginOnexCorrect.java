package am.qa.login.onex;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.onex.member.area.page.OnexMemberArea;
import am.qa.onex.page.base.PageObject;

public class LoginOnexCorrect extends PageObject {

	public LoginOnexCorrect(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//input[@name='LoginForm[username]']")
	WebElement usernameField;
	
	public void fillUserName(String username) {
		usernameField.sendKeys(username);
	}
	
	@FindBy(xpath="//input[@name='LoginForm[password]']")
	WebElement passwordField;
	
	public void fillPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	@FindBy(xpath="//input[@id='loginform-rememberme']")
	WebElement chekboxRememberMe;
	
	public void RememberMe() {
	chekboxRememberMe.click();
        }
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitLoginButton;
	
	public OnexMemberArea submitLoginForm() {
		submitLoginButton.submit();
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
