package jg.sistem;

import org.junit.Test;
import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

import junit.framework.TestCase;


public class CalculatorSoapTest extends TestCase {
	
	//mvn jaxws:wsimport
	@Test
	public void testCalculator() {
	CalculatorSoap service = new Calculator().getCalculatorSoap();
	Integer okss = service.add(1,2);
	System.out.println("Sumar: " + okss);
	assertTrue(okss > 34);
	
	}
	
}
