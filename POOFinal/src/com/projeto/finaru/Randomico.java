package com.projeto.finaru;

import java.util.Random;

public class Randomico {
	public static int getRandomNumber(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
