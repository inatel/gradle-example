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
	 * @see MyService#sum(int, int)
	 */
	@Override
	public int sum(int a, int b) {
		return a + b;
	}

}
