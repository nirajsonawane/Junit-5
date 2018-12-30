package com.niraj;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SimpleParameterizedTest {

	@ParameterizedTest
	@ValueSource(strings = { "Hello", "World" })
	void withFixValues(String word) {
		System.out.println(word);
		assertNotNull(word);

	}

	@ParameterizedTest(name = "withSomeName #{index} with Value [{arguments}]")
	@ValueSource(strings = { "Hello", "World" })
	void withSomeName(String word) {
		System.out.println(word);
		assertNotNull(word);

	}

	@ParameterizedTest(name = "withSomeName #{index} with Value [{arguments}]")
	@EnumSource(MyTestEnum.class)
	void withSomeEnum(MyTestEnum myEnum) {
		System.out.println(myEnum);
		assertNotNull(myEnum);

	}

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
	@MethodSource("com.niraj.MethodSource#stringProvider")
	void methodSourceFromOtherClass(String word) {
		System.out.println(word);
		assertNotNull(word);
	}

	@ParameterizedTest
	@CsvSource({ "Hello, 5", "World, 5", "test,4" })
	void withCsvSource(String word, int length) {

		assertEquals(word.length(), length);
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/testdata.csv")
	void withCsvFileSource(String word, int length) {
		assertEquals(word.length(), length);
	}
	
	@ParameterizedTest
	@ValueSource(strings ={ "niraj,sonawane"})
	void withCustomConverter(@ConvertWith(EmpConverter.class) Emp emp) {

		assertEquals(emp.getFirstName(),"niraj");
		assertEquals(emp.getLastName(),"sonawane");
	}

}
