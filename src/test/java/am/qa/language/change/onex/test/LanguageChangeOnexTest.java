package am.qa.language.change.onex.test;

import org.testng.annotations.Test;

import am.qa.onex.homepage.OnexHomePage;
import am.qa.onex.page.register.OnexRegisterPage;
import am.qa.onex.test.base.OnexTestBase;

public class LanguageChangeOnexTest extends OnexTestBase{

	
	@Test
	private void languageChangeRusOnex() {
		
		OnexHomePage home = new OnexHomePage(driver);
		home = home.openLanguageDropDown();
		home.changeLanguageRu();
		
	}
	
//	@Test
//	private void languageChangeArmOnex() {
//		
//		
//	}
//	
//	@Test
//	private void languageChangeEngOnex() {
//		
//		
//	}
//	
  }
