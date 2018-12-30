package com.niraj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvSourceParameterizedTest {

	
	@ParameterizedTest
	@CsvSource({ "Hello, 5", "World, 5", "test,4" })
	void withCsvSource(String word, int length) {

		assertEquals(word.length(), length);
	}

	
}
