package jefy.lopes.tests;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import jefy.lopes.core.BaseTest;
import jefy.lopes.pages.ContasPage;
import jefy.lopes.pages.MenuPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContaTest extends BaseTest {
	
	MenuPage menu = new MenuPage();
	ContasPage conta = new ContasPage();
	
	@Test
	public void test1_Inserir() {
		menu.menuAdiciona();
		conta.contaNome("Conta qualquer");
		conta.salvar();
		Assert.assertEquals("Conta adicionada com sucesso!", conta.obterMensagemSucesso());
	}
	
	@Test
	public void test2_ContaAlterar() {
		menu.menuListar();
		
		conta.clicarAlterarConta("Conta qualquer");
		conta.nomeContaAlterar("Conta alterada");
		conta.salvar();
		Assert.assertEquals("Conta alterada com sucesso!", conta.obterMensagemSucesso());
	}
	
	@Test
	public void test3_ContaMesmoNome() {
		menu.menuAdiciona();
		
		conta.contaNome("Conta alterada");
		conta.salvar();
		Assert.assertEquals("Já existe uma conta com esse nome!", conta.obterMensagemFalha());
	}
	
}
