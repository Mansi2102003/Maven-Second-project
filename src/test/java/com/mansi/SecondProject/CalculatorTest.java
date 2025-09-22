package com.mansi.SecondProject;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	 private Calculator calc;
	 
	 @BeforeEach
		void setUp() throws Exception {
			calc = new Calculator();
		}
	 
	 @Test
	 @DisplayName("Simple multiplication should work ")
	 void testMultiply() {
		 assertEquals(20, calc.multiply(5, 4), "Multiplication should work");
	 }
	 @Test
	 void testDivideByZero() {
		 assertEquals(0, calc.multiply(5,0), "Multiplication with 0 should be zero");
		 assertEquals(0, calc.multiply(0,5), "Multiplication with 0 should be zero");
	 }
	 

}
