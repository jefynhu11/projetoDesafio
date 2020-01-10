package jefy.lopes.pages;

import org.openqa.selenium.By;

import jefy.lopes.core.BasePage;

public class RemoveContaMoviPage extends BasePage{
	
	public void excluirMovi() {
		clicarBotao(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']"));
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//*[@class='alert alert-success']"));
	}
	
	public void selectMes() {
		selecionarCombo("mes", "Novembro");
	}

	public void selectAno() {
		selecionarCombo("ano", "2012");
	}

	public void buscar() {
		clicarBotao(By.xpath("//input[@class='btn btn-primary']"));
	}


}
