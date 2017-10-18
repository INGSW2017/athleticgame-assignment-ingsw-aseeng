package it.unical.test;

import java.time.Instant;

import org.junit.*;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	private static AthleticGame ag;

	@BeforeClass
	public static void init() {

		ag = new AthleticGame("calcio");
	}

	@Test
	public void addArrivalTest() {

		ag.addArrival("ancilette", Instant.now());
		Assert.assertEquals(1, ag.getArrivals().size());
	}

	@Test(expected = IllegalArgumentException.class)
	public void getParecipiantTimeTest() {

		ag.getParecipiantTime("ciccio");
	}
}
