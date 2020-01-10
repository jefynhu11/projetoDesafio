package jefy.lopes.pages;

import org.openqa.selenium.By;

import jefy.lopes.core.BasePage;
import jefy.lopes.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessoTelaLogin() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me/");
	}
	
	public void setEmail(String email) {
		escrever("email", email);
	}
	
	public void setSenha(String senha) {
		escrever("senha", senha);
	}

	public void entrar() throws InterruptedException {
//		Thread.sleep(2000);
		clicarBotao(By.xpath("//button[.='Entrar']"));
	}
	
	public void logar(String email, String senha) throws InterruptedException {
		acessoTelaLogin();
		setEmail(email);
		setSenha(senha);
		entrar();
	}
}
