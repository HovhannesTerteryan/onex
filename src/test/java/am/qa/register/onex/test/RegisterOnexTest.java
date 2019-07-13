package am.qa.register.onex.test;

import org.testng.annotations.Test;

import am.qa.onex.homepage.OnexHomePage;
import am.qa.onex.page.register.OnexRegisterPage;
import am.qa.onex.test.base.OnexTestBase;

public class RegisterOnexTest extends OnexTestBase{

	
	
	@Test
	private void registerOnexEmptyPassConfirm() {
		
		// Open onex home page 
		//done in before class  -- from parent OnexTestBase class
		
		//click on register button
		OnexHomePage home = new OnexHomePage(driver);
		OnexRegisterPage  register = home.openRegisterPage();
		
		
		//fill everything but password confirmation input
		register.fillUserEmail("aaa");
		register.filluserPassword("passwd");
		register.filluserPhoneNumber("123457879");
				
		//click submit registration button
		register.submitRegisterForm();
		
	}
	
	@Test
	private void registerOnexWrongPassConfirm() {
		
		OnexHomePage home = new OnexHomePage(driver);
		OnexRegisterPage  register = home.openRegisterPage();
		
		
		register.fillUserEmail("aaa");
		register.filluserPassword("passwd");
		register.fillpasswordConfirm("wrong");
		register.filluserPhoneNumber("123457879");
		register.submitRegisterForm();
	
	}
	
//	@Test
//	private void registerOnexCorrect() {
//		
//		
//		
//	}
}
