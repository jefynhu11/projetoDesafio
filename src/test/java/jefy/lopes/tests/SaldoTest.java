package jefy.lopes.tests;

import org.junit.Assert;
import org.junit.Test;

import jefy.lopes.core.BaseTest;
import jefy.lopes.pages.HomePage;

public class SaldoTest extends BaseTest {

	HomePage home = new HomePage();
	
	@Test
	public void verificarSaldo() {
		
		Assert.assertEquals("100.00", home.obterSaldo("Conta alterada"));
		
	}
	
}
