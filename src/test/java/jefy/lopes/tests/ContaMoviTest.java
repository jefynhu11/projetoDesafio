package jefy.lopes.tests;

import static jefy.lopes.util.DataUtil.obterDataFormatada;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;

import jefy.lopes.core.BaseTest;
import jefy.lopes.pages.ContaMoviPage;
import jefy.lopes.pages.ContasPage;
import jefy.lopes.pages.MenuPage;
import jefy.lopes.util.DataUtil;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ContaMoviTest extends BaseTest{
	
	MenuPage menu = new MenuPage();
	ContaMoviPage movimentacao = new ContaMoviPage();
	ContasPage conta = new ContasPage();
	
	@Test
	public void test1_ContaMovi() {
		menu.menuContaMovi();

		movimentacao.tipoMoviDespesa("Despesa");
//		movimentacao.dataMovi("08/08/2008");
		movimentacao.dataMovi(obterDataFormatada(new Date()));
//		movimentacao.dataPag("08/09/2008");
		movimentacao.dataPag(obterDataFormatada(new Date()));
		movimentacao.descricao("Cartão credito");
		movimentacao.interessado("Testando");
		movimentacao.valor("100.00");
		movimentacao.selectConta("Conta alterada");
		movimentacao.clicaRadioPago();
		movimentacao.salvar();
		Assert.assertEquals("Movimentação adicionada com sucesso!", movimentacao.obterTexto(By.xpath("//*[@class='alert alert-success']")));
	}
	
	@Test
	public void test2_ContaMoviObrigatorio() {
		menu.menuContaMovi();
		
		movimentacao.salvar();
		
		List<String> erros = movimentacao.obterErros();
//		Assert.assertEquals("Data da Movimentação é obrigatório", erros.get(0));
//		Assert.assertTrue(erros.contains("Data da Movimentação é obrigatório"))
		Assert.assertTrue(erros.containsAll(Arrays.asList(
				"Data da Movimentação é obrigatório", "Data do pagamento é obrigatório", "Descrição é obrigatório",
				"Interessado é obrigatório", "Valor é obrigatório", "Valor deve ser um número")));
		Assert.assertEquals(6, erros.size());
	}
	
	@Test
	public void test3_ContaMoviFutura() {
		menu.menuContaMovi();
		
		/*** Data pra frente (atual dia é 2 e bota (2) para frente atualizar dia 4 ***/
		Date dataFutura = DataUtil.obterDataDiferencaDias(10);

		movimentacao.tipoMoviDespesa("Despesa");
		movimentacao.dataMovi(obterDataFormatada(dataFutura));
		movimentacao.dataPag(obterDataFormatada(dataFutura));
		movimentacao.descricao("Cartão credito");
		movimentacao.interessado("Testando");
		movimentacao.valor("500");
		movimentacao.selectConta("Conta alterada");
		movimentacao.clicaRadioPago();
		movimentacao.salvar();
		
		List<String> erros = movimentacao.obterErros();
		Assert.assertTrue(erros.contains("Data da Movimentação deve ser menor ou igual à data atual"));
		Assert.assertEquals(1, erros.size());
	}

}
