package br.inatel.example.gradle.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MyServiceImplTest {

	private static final String NAME = "Test";
	private static final String PREFIX = "<h1>Hello ";
	private static final String SUFFIX = "!!!</h1>";

	@InjectMocks
	private MyServiceImpl myServiceImpl;

	@Test
	public void shouldSayHello() {
		// given
		String expected = PREFIX + NAME + SUFFIX;

		// when
		String result = myServiceImpl.sayHello(NAME);

		// then
		assertEquals(expected, result);
	}

}
