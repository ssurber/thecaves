package com.czuber.thecaves.implementation;

import java.util.Arrays;
import java.util.Random;

public class CaveGenerator {
	Random random;
	private static final int MAX_CAVES = 68;
	private static final int MAX_STAIR_FORK = 21;

	public CaveGenerator(int seed) {
		random = new Random(seed);
	}
	
	protected int getNextRandom(int limit) {
		return random.nextInt(limit);
	}

	protected int getNextCaveRandom() {
		return getNextRandom(MAX_CAVES);
	}
	
	protected int getNextStairRandom() {
		return getNextRandom(MAX_STAIR_FORK);
	}

	public CaveType[] generateCaves() {
		CaveType[] caves = new CaveType[MAX_CAVES];
		//TODO: Verify order is always the same.
		for (CaveType cave : Arrays.asList(CaveType.values())) {
			for (int x = 0; x < cave.getNumOccurrancces(); x++) {
				caves[getEmptyCave(caves)] = cave;
				if(cave == CaveType.FORK || cave == CaveType.STAIRS) {
					cave.setDownLeft(getNextStairRandom());
					cave.setUpRight(getNextStairRandom());
				}
			}
		}
		fillEmpty(caves);
		return caves;
	}

	private int getEmptyCave(CaveType[] caves) {
		int caveNum;
		do {
			caveNum = getNextCaveRandom();
		} while (caves[caveNum] != null);
		return caveNum;
	}

	private void fillEmpty(CaveType[] caves) {
		// fill with SafeCave
		for (int i = 0; i < MAX_CAVES; i++) {
			if (caves[i] == null) {
				caves[i] = CaveType.EMPTY;
			}
		}
	}
}
