package com.test.java;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.java.main.NumberWords;


public class NumberWordsApplicationTest {
	
	//private  NumberWords numWords =null;
	
	@BeforeClass
	public static void runOnlyOnceBeforeAll(){
		System.out.println("Unit tests starts ::::: ");
	}
	
	@Before
	public void runBeforeEachTest(){
		System.out.println("..");
	}
	@Test
	public void testPositiveNumbers(){
		System.out.println("Test positive number is running ");
		NumberWords numWords =  new NumberWords();
		assertEquals("Ten",numWords.toWords(10));
		assertEquals("Twelve Thousand Three Hundred Forty Five",numWords.toWords(12345));
		assertEquals("One Thousand Ten",numWords.toWords(1010));
//		assertNotEquals("Ninety Eight",numWords.toWords(99));
		assertNotNull(numWords.toWords(1));
		assertTrue("One".equals(numWords.toWords(1)));
		
	}
	
	@Test
	public void testNegativeNumbers(){
		System.out.println("Test negative number is running ");
		NumberWords numWords =  new NumberWords();
		assertEquals("Minus Ten",numWords.toWords(-10));
		assertEquals("Minus Twelve Thousand Three Hundred Forty Five",numWords.toWords(-12345));
//		assertNotEquals("Ninety Eight",numWords.toWords(99));
		assertNotNull(numWords.toWords(-1));
		assertTrue("Minus One".equals(numWords.toWords(-1)));
		
		
	}
	
	
	@Test(expected=RuntimeException.class)
	public void testExceptions(){
		System.out.println("Test Exceptions number is running ");
		NumberWords numWords =  new NumberWords();
		System.out.println(10/0);
		assertEquals("Minus Ten",numWords.toWords(-10));
	}
	
	
}
