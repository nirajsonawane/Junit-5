package com.niraj;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class DisplayNameForParameterizedTest {

	@ParameterizedTest(name = "withSomeName #{index} with Value [{arguments}]")
	@ValueSource(strings = { "Hello", "World" })
	void withSomeName(String word) {
		System.out.println(word);
		assertNotNull(word);

	}
}
