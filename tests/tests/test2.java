package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import calculate.Calculator;
import main.MainFrame;

public class test2 {

	private Calculator calculator;

	@Test
	public void test() {
		String result; //тестовые параметр
		calculator = new Calculator();;
        result = calculator.calcCamera(8, 680894 , 1 , 1);
        assertEquals(result, "65,37 Гб/с"); //ожидаемый результат
	}


}
