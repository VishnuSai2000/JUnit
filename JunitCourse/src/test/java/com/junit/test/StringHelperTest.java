package com.junit.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	@Test
	public void testTruncateAInFirst2Positions() {
//		StringHelper helper = new StringHelper();
//		String actual = helper.truncateAInFirst2Positions("AACD");
//		String expected = "CD";
//		assertEquals(expected,actual);
//		**This is the inline expression for the above lines of code**
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		
	}
	
	@Test
	public void testTruncateAInFirst2Positions2() {
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test 
	public void testToverifyFirstandLasttwoCharareSame() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		
	}
	@Test
	public void testtestToverifyFirstandLasttwoCharareSame_PositiveCase() {
		assertTrue( helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
}
