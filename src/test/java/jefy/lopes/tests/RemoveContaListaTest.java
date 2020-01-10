package jefy.lopes.tests;

import org.junit.Assert;
import org.junit.Test;

import jefy.lopes.pages.ContasPage;
import jefy.lopes.pages.MenuPage;

public class RemoveContaListaTest {

	MenuPage menu = new MenuPage();
	ContasPage conta = new ContasPage();
	
	@Test 
	public void testContaMoviRemove() {
		menu.menuListar();
		
		conta.clicarExcluirConta("Conta alterada");
		
		Assert.assertEquals("Conta em uso na movimentações", conta.obterMensagemFalha());
	}
	
}
