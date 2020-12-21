package br.com.dsdesenvolvimento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dsdesenvolvimento.model.Person;
import br.com.dsdesenvolvimento.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonServices services;

	// http://localhost:8080/person/1
	@RequestMapping(
				value="/{id}", 
				method = RequestMethod.GET,
				produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
			)
	public Person findById(@PathVariable("id")String id) {
		return services.findById(id);
	}

	// http://localhost:8080/person
	@RequestMapping(
			method = RequestMethod.GET,
			produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
		)
	public List<Person> findAll() {
		return services.findAll();
	}
	
	// http://localhost:8080/person
	@RequestMapping(
			method = RequestMethod.POST,
			consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE,
			produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
		)
		public Person create(@RequestBody Person person) {
			return services.create(person);
		}
	
	// http://localhost:8080/person
	@RequestMapping(
			method = RequestMethod.PUT,
			consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE,
			produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
		)
		public Person update(@RequestBody Person person) {
			return services.update(person);
		}
	
	// http://localhost:8080/person/1
	@RequestMapping(
				value="/{id}", 
				method = RequestMethod.DELETE,
				produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE
			)
	public void delete(@PathVariable("id")String id) {
		services.delete(id);
	}

}
