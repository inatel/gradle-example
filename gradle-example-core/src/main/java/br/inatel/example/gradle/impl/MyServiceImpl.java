package br.inatel.example.gradle.impl;

import br.inatel.example.gradle.api.MyService;

public class MyServiceImpl implements MyService {

	@Override
	public String sayHello(String name) {
		return "<h1>Hello " + name + "!!!</h1>";
	}

}
