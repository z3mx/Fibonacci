package com.lavsystems.examples.fibonacci;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lavsystems.examples.fibonacci.model.Fibonacci;

import lombok.extern.slf4j.Slf4j;

/**
 * Main class to 
 * @author lantonio
 *
 */
@Slf4j
@SpringBootApplication
public class FibonacciSequenseApp {

	/**
	 * main method.
	 * 
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) {
		log.debug("::::::::::::::::::FIBONACCI-SEQUENCE::::::::::::::::::");
		Fibonacci fibonacci = new Fibonacci("fibonacci 1",200); 
		fibonacci.mostrarSerie();
		log.debug("::::::::::::::::::END-SEQUENCE::::::::::::::::::");
	}
}
