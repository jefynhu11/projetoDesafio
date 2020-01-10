package jefy.lopes.pages;

import org.openqa.selenium.By;

import jefy.lopes.core.BasePage;
import junit.framework.Assert;

public class MenuPage extends BasePage {
	
	public void menuAdiciona() {
		clicarBotao(By.xpath("//a[@class='dropdown-toggle']"));
		clicarBotao(By.xpath("//a[.='Adicionar']"));
	}
	
	public void menuListar() {
		clicarBotao(By.xpath("//a[@class='dropdown-toggle']"));
		clicarBotao(By.xpath("//a[.='Listar']"));
	}
	
	public void menuContaMovi() {
		clicarBotao(By.xpath("//a[.='Criar Movimentação']"));
	}
	
	public void menuResumoMensal() {
		clicarBotao(By.xpath("//a[.='Resumo Mensal']"));
	}
	
	public void menuHome() {
		clicarBotao(By.xpath("//a[.='Home']"));
	}

}
