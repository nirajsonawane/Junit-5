package com.niraj;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public class ArgumentSourceParameterizedTest {



	@ParameterizedTest
	@ArgumentsSource(StringArgumentsProvider.class)
	void testWithArgumentsSource(String argument) {
		assertNotNull(argument);
	}

}
