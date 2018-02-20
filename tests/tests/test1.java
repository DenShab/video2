package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import calculate.Calculator;

public class test1 {

	private Calculator calculator;

	@Test
	public void test() {
		String result; //тестовые параметр
		calculator = new Calculator();;
        result = calculator.ReturnCalc(1, 8, 680894 , 1, 7);
        assertEquals(result, "411,80 ТБ"); //ожидаемый результат
	}

}
