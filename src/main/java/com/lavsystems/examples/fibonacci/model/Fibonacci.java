package com.lavsystems.examples.fibonacci.model;

import java.text.DecimalFormat;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Fibonacci {

	/**
	 * size of Sequence.
	 */
	public int size;

	/**
	 * name of Sequence
	 */
	public String name;

	public Fibonacci(String name, int size) {
		this.name = name;
		this.size = size;
	}

	/**
	 * Method to calculate Fibonacci.
	 * the values where will storage the current value and before value it should be double.
	 * 
	 * @throws InterruptedException
	 */
	public void mostrarSerie() {
		log.debug("{} de tamaño {} : ", this.name, this.size);

		DecimalFormat df = new DecimalFormat("#");
		df.setMaximumFractionDigits(0);

		double fibonacci = 0;
		double anterior = 0;
		double penultimo;

		for (int i = 0; i <= this.size; i++) {
			if (anterior == 0) {
				penultimo = fibonacci;
				fibonacci = anterior + fibonacci;
				anterior = 1;
			} else {
				penultimo = fibonacci;
				fibonacci = anterior + fibonacci;
				anterior = penultimo;
			}

			System.out.println("current in serie: {" + i + "}  value {" + df.format(fibonacci) + "}");
		}
	}

}
