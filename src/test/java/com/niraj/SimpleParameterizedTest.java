package com.niraj;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SimpleParameterizedTest {

	@ParameterizedTest
	@ValueSource(strings = { "Hello", "World" })
	void withSomeValues(String word) {
		System.out.println(word);
		assertNotNull(word);

	}

}
