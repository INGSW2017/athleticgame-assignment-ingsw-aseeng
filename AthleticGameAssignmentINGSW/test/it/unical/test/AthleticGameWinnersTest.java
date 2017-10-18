package it.unical.test;

import java.time.Instant;

import org.junit.*;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {

	/*
	 * aggiungere due metodi di test per la funzione getWinner (scegliere i test
	 * in modo significativo, ma a piacere)
	 */

	private static AthleticGame ag;

	@BeforeClass
	public static void init() {

		ag = new AthleticGame("calcio");
	}

	@After
	public void reset() {
		ag.reset();
	}

	@Before
	public void start() {
		ag.start();
	}

	@Test
	public void getWinnerTestFirst() {
		
		ag.addArrival("saluta andonio", Instant.now().plusMillis(100));
		ag.addArrival("buonaseee", Instant.now().plusMillis(500));
		ag.addArrival("signor ciccio", Instant.now().plusMillis(1000));
		
		Assert.assertEquals("saluta andonio",ag.getWinner());
	}

	@Test
	public void getWinnerTestSecond() {
		
		ag.addArrival("nicuola", Instant.now().plusMillis(100));
		ag.addArrival("signor ciccio", Instant.now().plusMillis(100));
		ag.addArrival("signor gaetano", Instant.now().plusMillis(1000));
		ag.addArrival("zarola", Instant.now().plusMillis(200));
		ag.addArrival("o ci", Instant.now().plusMillis(500));
		
		Assert.assertEquals("nicuola",ag.getWinner());
		
	}

}
