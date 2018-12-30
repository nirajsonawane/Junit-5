package com.niraj;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumSourceParameterizedTest {

	

	@ParameterizedTest(name = "withSomeName #{index} with Value [{arguments}]")
	@EnumSource(MyTestEnum.class)
	void withSomeEnum(MyTestEnum myEnum) {
		System.out.println(myEnum);
		assertNotNull(myEnum);

	}

	
}
