package com.eculant.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ConCodeConstraintValidator implements ConstraintValidator<ConCode, String>{

	String conPrefix;
	
	@Override
	public void initialize(ConCode theConCode) {
		
		//define prefix
		conPrefix = theConCode.value();
		
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		
		boolean result;
		
		if(	theCode != null) {
			result = theCode.startsWith(conPrefix);
		}
		else {
			result=true;
		}
		return result;
	}

}
