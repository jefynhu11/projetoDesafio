package jefy.lopes.tests;

import static jefy.lopes.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Test;

import jefy.lopes.core.BaseTest;
import jefy.lopes.pages.MenuPage;

public class ResumoMensalTest extends BaseTest{

	MenuPage menu = new MenuPage();
	
	
	@Test
	public void TestResumoMensal() {
		menu.menuResumoMensal();
		
		Assert.assertEquals("Seu Barriga - Extrato", getDriver().getTitle());
	}
}
