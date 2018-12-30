package com.niraj;	

import java.util.stream.Stream;

import org.junit.jupiter.params.provider.Arguments;

public class MethodSource {

	
	public static Stream<Arguments> stringProvider()
	{
		return Stream.of(
				Arguments.of("Values"),
				Arguments.of("From"),
			    Arguments.of("MethodSource"));
		
	}
}
