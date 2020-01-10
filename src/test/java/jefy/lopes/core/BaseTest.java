package jefy.lopes.core;

import static jefy.lopes.core.DriverFactory.getDriver;
import static jefy.lopes.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import jefy.lopes.pages.LoginPage;

public class BaseTest {

	private LoginPage login = new LoginPage();
	
	@Rule
	public TestName testNome = new TestName();
	
	@Before
	public void inicializa() throws InterruptedException {
//		login.acessoTelaLogin();
//		login.setEmail("jefy@lopes");
//		login.setSenha("treinar");
//		login.entrar();
		
		login.logar("jefy@lopes", "treinar");
	}
	
	
	@After
	public void finaliza() throws IOException{
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("C:\\Users"+File.separator+"jeferson.lopes"+File.separator+"eclipse-workspace"+File.separator+"Curso67"+File.separator+"target"+File.separator+"screenshot"+File.separator+testNome.getMethodName()+".jpg"));
		
		if(Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
	}
	
}
