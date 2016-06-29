package br.inatel.example.gradle.impl;

import br.inatel.example.gradle.api.MyService;

/**
 * @see MyService
 */
public class MyServiceImpl implements MyService {

	/**
	 * @see MyService#sayHello(String)
	 */
	@Override
	public String sayHello(String name) {
		return "<h1>Hello " + name + "!!!</h1>";
	}

	/**
	 * @see MyService#sum(Integer, Integer)
	 */
	@Override
	public Integer sum(Integer a, Integer b) {
		if (a == null || b == null) {
			return null;
		}
		return a + b;
	}

}
