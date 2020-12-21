package br.com.dsdesenvolvimento.math;

import br.com.dsdesenvolvimento.request.converters.NumberConverters;

public class SimpleMath {

	public Double sum(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;	
	} 
	
	public Double sub(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;	
	}
	
	public Double div(Double firstNumber, Double secondNumber) {
		return firstNumber / secondNumber;	
	}
	
	public Double mul(Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;	
	}
	
	public Double rqu(Double number) {
		return Math.sqrt(number);	
	}
}
