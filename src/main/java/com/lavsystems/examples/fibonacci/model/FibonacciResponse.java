package com.lavsystems.examples.fibonacci.model;

import java.util.Map;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Class to handle the response on Controller.
 * 
 * @author lantonio
 *
 */
@Getter
@Setter
@Builder
public class FibonacciResponse {

	/**
	 * fibonacci Attribute.
	 */
	private Map<String,Double> fibonacci;
}
