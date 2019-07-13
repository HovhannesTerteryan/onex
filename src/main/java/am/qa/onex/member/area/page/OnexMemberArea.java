package am.qa.onex.member.area.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import am.qa.onex.balance.OnexBalancePage;
import am.qa.onex.page.base.PageObject;

	public class OnexMemberArea extends PageObject {

		public OnexMemberArea(WebDriver driver) {
			super(driver);
			}

		@FindBy(xpath="//a[@href='/account/balances']")
		WebElement myBalance;
		
		public OnexBalancePage openBalancePage() {
			myBalance.click();
			return new OnexBalancePage(driver);
			}
		
		public OnexMemberArea openMemberArea() {
			return new OnexMemberArea(driver);
		}
		
}
