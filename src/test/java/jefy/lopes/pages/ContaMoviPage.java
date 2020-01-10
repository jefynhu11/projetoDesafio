package jefy.lopes.pages;

import static jefy.lopes.core.DriverFactory.getDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import jefy.lopes.core.BasePage;
import jefy.lopes.core.DriverFactory;

public class ContaMoviPage extends BasePage{

	public void tipoMovi() {
		clicarBotao(By.id("tipo"));
	}
	public void tipoMoviReceita(String valor) {
		selecionarCombo("tipo", valor);
	}
	public void tipoMoviDespesa(String valor) {
		selecionarCombo("tipo", valor);
	}
	public void dataMovi(String string) {
		escrever(By.id("data_transacao"), string);
	}
	public void dataPag(String string) {
		escrever(By.id("data_pagamento"), string);
	}
	public void descricao(String string) {
		escrever(By.id("descricao"), string);
	}
	public void interessado(String string) {
		escrever(By.id("interessado"), string);
	}
	public void valor(String valor) {
		escrever(By.id("valor"), valor);
	}
	public void selectConta(String valor) {
		selecionarCombo("conta", valor);
	}
	public void clicaRadioPago() {
		clicarRadio(By.id("status_pago"));
	}
	public void clicaRadioPendente() {
		clicarRadio(By.id("status_pendente"));
	}
	/*** Pode fazer duas formas ***/
//	public void salvar() {
//		clicarBotao(By.xpath("//*[@class='btn btn-primary']"));
//	}
	public void salvar() {
		clicarBotao(By.xpath("//button[.='Salvar']"));
	}
	
	public List<String> obterErros(){
		List<WebElement> erros = getDriver().findElements(By.xpath("//*[@class='alert alert-danger']//li"));
		List <String> returno = new ArrayList<String>();
		for(WebElement erro : erros) {
			returno.add(erro.getText());
		}
		return returno;
	}
}
