package jefy.lopes.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import jefy.lopes.tests.ContaMoviTest;
import jefy.lopes.tests.ContaTest;
import jefy.lopes.tests.RemoveContaListaTest;
import jefy.lopes.tests.RemoveContaMoviTest;
import jefy.lopes.tests.ResumoMensalTest;
import jefy.lopes.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	ContaMoviTest.class,
	RemoveContaListaTest.class,
	SaldoTest.class,
	RemoveContaMoviTest.class,
	ResumoMensalTest.class
})

public class TestSuite {

	
}
