package com.niraj;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class EmpConverter implements ArgumentConverter {

	@Override
	public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {
		if (source instanceof String)
			try {
				String[] split = ((String) source).split(",");
				return new Emp(split[0], split[1]);

			} catch (NumberFormatException ex) {
				String message = source + " is no correct string representation of a Emp.";
				throw new ArgumentConversionException(message, ex);
			}
		throw new ArgumentConversionException(source + " is no valid point");
	}

}
