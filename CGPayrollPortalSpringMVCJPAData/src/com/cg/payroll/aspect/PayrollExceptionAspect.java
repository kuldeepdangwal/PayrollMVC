package com.cg.payroll.aspect;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;

@ControllerAdvice
public class PayrollExceptionAspect {
	@ExceptionHandler(AssociateDetailsNotFoundException.class)
	public ModelAndView handleAssociateDetailNotfoundException(Exception e) {
		return new ModelAndView("findAssociateDetailsPage", "errorMessage",e.getMessage());
	}
}