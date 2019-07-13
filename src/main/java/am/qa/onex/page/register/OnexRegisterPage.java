package am.qa.onex.page.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import am.qa.onex.page.base.PageObject;

	public class OnexRegisterPage extends PageObject {

		public OnexRegisterPage(WebDriver driver) {
			super(driver);
			}
		
				
		@FindBy(xpath="//input[@name='User[email]']")
		WebElement userEmail;
		
		@FindBy(xpath="//input[@name='User[phone]']")
		WebElement userPhoneNumber;
		
		@FindBy(xpath="//input[@name='User[newPassword]']")
		WebElement userPassword;
		
		@FindBy(xpath="//input[@name='User[newPasswordConfirm]']")
		WebElement passwordConfirm;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement submitRegister;
		
		public void fillUserEmail(String email) {
			userEmail.sendKeys(email);
		}
		
		public void filluserPhoneNumber(String phoneNumber) {
			userPhoneNumber.sendKeys(phoneNumber);
		}
		
		public void filluserPassword(String password) {
			userPassword.sendKeys(password);
		}
		
		public void fillpasswordConfirm(String password) {
			passwordConfirm.sendKeys(password);
		}
				
		public OnexRegisterStepTwo submitRegisterForm() {
		submitRegister.submit();
		return new OnexRegisterStepTwo(driver);
		}
		
//		public PageObject doRegister(String email, String phoneNumber, String password) {
//			fillUserEmail(email);
//			filluserPhoneNumber (phoneNumber);
//			filluserPassword(password);
//			submitRegisterForm();
//			return new PageObject(driver);
//		}
		
	}

