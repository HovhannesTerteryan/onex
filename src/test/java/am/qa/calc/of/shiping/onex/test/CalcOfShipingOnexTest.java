package am.qa.calc.of.shiping.onex.test;

import org.testng.annotations.Test;

import am.qa.onex.homepage.OnexHomePage;
import am.qa.onex.test.base.OnexTestBase;

public class CalcOfShipingOnexTest extends OnexTestBase {

	// shnik test@ nshanakum e ays method@ testng.xml@ kanchelu e vorpes test
	@Test
	private void calcOfShipingRus() {
		// open\oneX -- automat from base class
		// navigate to ship from Rus n- sarqum enq page object, element u click anelu
		// method
		OnexHomePage home = new OnexHomePage(driver); // ays hramannerov sarqvum e home object, vor@ OnexHomePage tesaki
														// e - hetevabar ira vra karogh enq kanchel cankacac
														// onexHomePage-i mej sahmanats method home.methodAnun() eghanakov
		home.navigateToShipFromRussia();
		// click on esim inch\
		// verify esinch element present
	}

	@Test
	private void calcOfShipingUsa() {

	}

	@Test
	private void calcOfShipingGB() {

	}

	@Test
	private void calcOfShipingChina() {

	}

	@Test
	private void calcOfShipingUae() {

	}

	@Test
	private void calcOfShipingSuperVolumWeigth() {

		
	}

}
