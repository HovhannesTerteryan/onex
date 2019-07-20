package am.qa.login.onex.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import am.qa.onex.homepage.OnexHomePage;
import am.qa.onex.member.area.page.OnexMemberArea;
import am.qa.onex.page.login.OnexLoginPage;
import am.qa.onex.test.base.OnexTestBase;

public class LoginOnexCorrectTest extends OnexTestBase {

	
	@Test
	private void loginOnexEmptyPass() {

		OnexHomePage home = new OnexHomePage(driver);
		OnexLoginPage loginOnexEmptyPass = home.openLoginPage();

		 loginOnexEmptyPass.doLogin("asdads", "", true);
		
	}
	
	@Test(dependsOnMethods = "loginOnexEmptyPass")
	private void loginOnexCorrect() {

		
		OnexHomePage home = new OnexHomePage(driver);
		OnexLoginPage loginOnexCorrect = home.openLoginPage();

		loginOnexCorrect.doLogin("correctEmail", "correctPassword", true);

	}

	
//
//	@Test
//	private void loginOnexForgotPass() {
//
//	}
//
//	@Test
//	private void loginOnexWrongEmail() {
//
//	}
//
//	@Test
//	private void loginOnexWrongPass() {
//
//	}

}
