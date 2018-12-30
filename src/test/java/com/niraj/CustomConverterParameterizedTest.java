package com.niraj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.ValueSource;

public class CustomConverterParameterizedTest {

	@ParameterizedTest
	@ValueSource(strings = { "niraj,sonawane" })
	void withCustomConverter(@ConvertWith(PersonConverter.class) Person emp) {

		assertEquals(emp.getFirstName(), "niraj");
		assertEquals(emp.getLastName(), "sonawane");
	}

}
