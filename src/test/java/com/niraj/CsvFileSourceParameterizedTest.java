package com.niraj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CsvFileSourceParameterizedTest {

	
	@ParameterizedTest
	@CsvFileSource(resources = "/testdata.csv")
	void withCsvFileSource(String word, int length) {
		assertEquals(word.length(), length);
	}
	
}
