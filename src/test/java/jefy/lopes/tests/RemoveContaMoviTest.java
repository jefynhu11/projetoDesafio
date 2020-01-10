package jefy.lopes.tests;

import org.junit.Assert;
import org.junit.Test;

import jefy.lopes.core.BaseTest;
import jefy.lopes.pages.MenuPage;
import jefy.lopes.pages.RemoveContaMoviPage;

public class RemoveContaMoviTest extends BaseTest{
	
	private MenuPage menu = new MenuPage();
	private RemoveContaMoviPage resumoMensal = new RemoveContaMoviPage();
	
	@Test 
	public void testContaMoviRemove() {
		menu.menuResumoMensal();
		
//		resumoMensal.selectMes();
//		resumoMensal.selectAno();
//		resumoMensal.buscar();
		resumoMensal.excluirMovi();
		
		Assert.assertEquals("Movimentação removida com sucesso!", resumoMensal.obterMensagemSucesso());
	}

}
