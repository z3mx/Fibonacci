package com.lavsystems.examples.fibonacci.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lavsystems.examples.fibonacci.model.Fibonacci;
import com.lavsystems.examples.fibonacci.model.FibonacciResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "${fibonacci.base-path}")
public class Controller {

	@GetMapping(value = "${fibonacci.endpoints.get-sequence}")
	public ResponseEntity<FibonacciResponse> getFibonacci(@PathVariable int size) {
		log.debug("::::::::::::::::::FIBONACCI-SEQUENCE::::::::::::::::::");
		Fibonacci fibonacci = new Fibonacci("Sequence", size);
		FibonacciResponse response =  FibonacciResponse.builder()
				.fibonacci(fibonacci.mostrarSerie())
				.build();
		log.debug("::::::::::::::::::END-SEQUENCE::::::::::::::::::");
		return new ResponseEntity<>(response, HttpStatus.OK); 
	}
}
