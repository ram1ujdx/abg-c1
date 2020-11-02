package com.cg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
@TestInstance(Lifecycle.PER_CLASS)
class CalculatorTest {

	Calculator calc;
	int count=0;
	@BeforeAll
	public void init() {
		calc=new Calculator();
		System.out.println("Init Method Called");
	}
	
	@AfterAll
	public void complete() {
		System.out.println("Testing Completed");
	}
	
	@BeforeEach
	public void beforeEachTest() {
		System.out.println("Test Started..");
	}
	
	@AfterEach
	public void afterEachTest() {
		System.out.println("Test Done..");
		count++;
		System.out.println("Total = "+count);
	}
	
	@Test
	void test_Add() {
		
		assertEquals(11, calc.add(5, 6));
	}
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	void test_Divide() {
		assertEquals(5, calc.divide(15, 3));
	}
	
	@Test
	//@EnabledOnJre(JRE.JAVA_14)
	void test_Divide_Exception() {
		assertThrows(ArithmeticException.class, ()->calc.divide(10, 0));
	}
	

}
