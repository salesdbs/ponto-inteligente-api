package br.com.dsdesenvolvimento.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.dsdesenvolvimento.Greeting;
import br.com.dsdesenvolvimento.math.SimpleMath;
import br.com.dsdesenvolvimento.request.converters.NumberConverters;

@RestController
public class MathController {
	
	private static final String template = "Hello, %s!";
	
	private final AtomicLong counter = new AtomicLong();
	
	private SimpleMath math = new SimpleMath();
	
	// http://localhost:8080/greeting?name=Davidson
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	// http://localhost:8080/sum/1/9
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)) {
			throw new Exception();
		}
		return math.sum(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));
	}
	
	// http://localhost:8080/sub/1/9
	@RequestMapping(value="/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)) {
			throw new Exception();
		}
		return math.sub(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));
	}
	
	// http://localhost:8080/div/4/2
	@RequestMapping(value="/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)) {
			throw new Exception();
		}
		return math.div(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));
	}
	
	// http://localhost:8080/mul/2/9
	@RequestMapping(value="/mul/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mul(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!NumberConverters.isNumeric(numberOne) || !NumberConverters.isNumeric(numberTwo)) {
			throw new Exception();
		}
		return math.mul(NumberConverters.convertToDouble(numberOne), NumberConverters.convertToDouble(numberTwo));
	}
	
	// http://localhost:8080/rqu/9
	@RequestMapping(value="/rqu/{numberOne}", method = RequestMethod.GET)
	public Double rqu(@PathVariable("numberOne") String numberOne) throws Exception {
		if (!NumberConverters.isNumeric(numberOne)) {
			throw new Exception();
		}
		return math.rqu(NumberConverters.convertToDouble(numberOne));
	}

}
