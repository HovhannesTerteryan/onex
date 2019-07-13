package am.qa.onex.page.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.onex.member.area.page.OnexMemberArea;
import am.qa.onex.page.base.PageObject;

public class OnexLoginPage extends PageObject {

	public OnexLoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//div[@class='col-lg-4']//div[@class='help-block']/text()")
	WebElement usernameEmptyError;
	
	@FindBy(xpath = "//input[@name='LoginForm[username]']")
	WebElement usernameField;

	public void fillUserName(String username) {
		usernameField.sendKeys(username);
	}

	@FindBy(xpath = "//input[@name='LoginForm[password]']")
	 WebElement passwordField;

	public void fillPassword(String password) {
		passwordField.sendKeys(password);
	}

	@FindBy(xpath = "//input[@id='loginform-rememberme']")
	WebElement rememberMe;

	public void fillRememberMe() {
		rememberMe.click();
	}

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitLogin;

	public PageObject submitLoginForm() {
		submitLogin.submit();
		return new PageObject(driver);
	}

	public PageObject doLogin(String username, String password, boolean rememberMe) {
		fillUserName(username);
		fillPassword(password);
		if (rememberMe) {
			fillRememberMe();
		}
		submitLoginForm();
		return new PageObject(driver);
	}
	
	public boolean verifyUsernameEmptyErrorPresent() throws Exception {
		return usernameEmptyError.isDisplayed();
	}

	public OnexMemberArea openMemberArea() {
		return new OnexMemberArea(driver);
	}

	public void submitLogin() {

	}

	public void RememberMe() {

	}

}
