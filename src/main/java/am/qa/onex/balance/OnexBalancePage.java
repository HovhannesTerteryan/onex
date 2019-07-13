package am.qa.onex.balance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.onex.member.area.page.OnexMemberArea;
import am.qa.onex.page.base.PageObject;


	public class OnexBalancePage extends PageObject {

		public OnexBalancePage(WebDriver driver) {
			super(driver);
			}
	
		@FindBy(xpath="//input [@id='paymentamount']")  
		WebElement paymentAmount;
	
		public void paymentAmount(String amount) {
			paymentAmount.sendKeys(amount);
		}
		
		@FindBy(xpath="//a [@id='makepayment']")  
		WebElement submitrecharg;
		
		
		public void submitrecharg() {
			submitrecharg.submit();
		}
}
	