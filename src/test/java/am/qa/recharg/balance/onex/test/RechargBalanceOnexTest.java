package am.qa.recharg.balance.onex.test;

import org.testng.annotations.Test;

import am.qa.onex.test.base.OnexTestBase;

public class RechargBalanceOnexTest extends OnexTestBase{

	@Test
	private void rechargBalanceOnexWait20Min() {
	}
	
	@Test
	private void rechargBalanceOnexWrongCardCVV() {
		
	}
	
	@Test
	private void rechargBalanceOnexWrongCardExpData() {
		
	}
	
	@Test
	private void rechargBalanceOnexWrongCardNum() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	private void rechargBalanceOnexWrongName() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
