package br.inatel.example.gradle.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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
		final String expected = PREFIX + NAME + SUFFIX;

		// when
		String result = myServiceImpl.sayHello(NAME);

		// then
		assertEquals(expected, result);
	}

	@Test
	public void shouldSum() {
		// given
		final int first = 2;
		final int second = 3;
		final int expected = 5;

		// when
		int result = myServiceImpl.sum(first, second);

		// then
		assertEquals(expected, result);
	}

	@Test
	public void shouldNotSumBecauseOfNullFirstParam() {
		// given
		final Integer first = null;
		final Integer second = 3;

		// when
		Integer result = myServiceImpl.sum(first, second);

		// then
		assertNull(result);
	}

	@Test
	public void shouldNotSumBecauseOfNullSecondParam() {
		// given
		final Integer first = 2;
		final Integer second = null;

		// when
		Integer result = myServiceImpl.sum(first, second);

		// then
		assertNull(result);
	}

	@Test
	public void shouldNotSumBecauseOfBothParamsNull() {
		// given
		final Integer first = null;
		final Integer second = null;

		// when
		Integer result = myServiceImpl.sum(first, second);

		// then
		assertNull(result);
	}

}
