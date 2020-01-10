package jefy.lopes.pages;

import org.openqa.selenium.By;

import jefy.lopes.core.BasePage;

public class ContasPage extends BasePage {
	
	public void contaNome(String text) {
		escrever(By.id("nome"), text);
	}
	public void salvar() {
		clicarBotao(By.xpath("//button[@class='btn btn-primary']"));
	}
	public String obterMensagemSucesso() {
		String text = obterTexto(By.xpath("//div[@class='alert alert-success']"));
		return text;
//		return Assert.assertEquals("......", obterTexto(By.xpath("//div[@class='alert alert-success']")));
	}
	
	public String obterMensagemFalha() {
		String text = obterTexto(By.xpath("//div[@class='alert alert-danger']"));
		return text;
//		return Assert.assertEquals("........", obterTexto(By.xpath("//div[@class='alert alert-success']")));
	}
	public void clicarAlterarConta(String text) {
		obterCelula("Conta", text, "Ações", "tabelaContas")
			.findElement(By.xpath(".//span[@class='glyphicon glyphicon-edit']")).click();
	}
	public void clicarExcluirConta(String text) {
		obterCelula("Conta", text, "Ações", "tabelaContas")
			.findElement(By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']")).click();
	}
	public void nomeContaAlterar(String string) {
		escrever(By.id("nome"), string);
	}

}
