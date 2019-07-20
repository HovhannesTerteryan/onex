package am.qa.recharg.balance.onex.test;

import org.testng.annotations.Test;

import am.qa.onex.homepage.OnexHomePage;
import am.qa.onex.member.area.page.OnexMemberArea;
import am.qa.onex.page.login.OnexLoginPage;
import am.qa.onex.test.base.OnexTestBase;

public class RechargBalanceOnexTest extends OnexTestBase{

	

			
	@Test
	private void rechargBalanceOnexWait20Min() {
		
		OnexHomePage home = new OnexHomePage(driver);
		OnexLoginPage loginOnexCorrect = home.openLoginPage();

		OnexMemberArea	onexMemberArea = (OnexMemberArea) loginOnexCorrect.doLogin("email", "password", true);
		
		onexMemberArea.openBalancePage();

		
	}
	
//	@Test
//	private void rechargBalanceOnexWrongCardCVV() {
//		
//	}
//	
//	@Test
//	private void rechargBalanceOnexWrongCardExpData() {
//		
//	}
//	
//	@Test
//	private void rechargBalanceOnexWrongCardNum() {
//		
//
//	}
//	
//	@Test
//	private void rechargBalanceOnexWrongName() {
//		
//		
//	}
	
}
