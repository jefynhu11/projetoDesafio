package jefy.lopes.pages;

import org.openqa.selenium.By;

import jefy.lopes.core.BasePage;

public class HomePage extends BasePage {
	
	public String obterSaldo(String text) {
		return obterCelula("Conta", text, "Saldo", "tabelaSaldo").getText();
	}

}
