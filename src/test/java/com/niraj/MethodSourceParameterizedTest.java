package com.niraj;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MethodSourceParameterizedTest {

	
	@ParameterizedTest
	@MethodSource("createWordsWithLength")
	void withMethodSource(String word, int length) {
		System.out.println("withMethodSource");
		assertNotNull(word);
	}

	private static Stream<Arguments> createWordsWithLength() {
		return Stream.of(Arguments.of("Hello", 5), Arguments.of("JUnit 5", 7));
	}

	@ParameterizedTest
	@MethodSource("com.niraj.ExternalClassMethodSource#stringProvider")
	void methodSourceFromOtherClass(String word) {
		System.out.println(word);
		assertNotNull(word);
	}

	
}
