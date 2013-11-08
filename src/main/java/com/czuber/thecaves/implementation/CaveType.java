package com.czuber.thecaves.implementation;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

public enum CaveType {
	EMPTY(0, null, true, null), 
	BATS(4, "Hear Squeak", true, null), 
	DARKCAVE(2, "Dark Cave", true, null),
	DRAGONCAVE(2, "Smell Dragons", true, null), 
	FIRE(2, null, true, null), 
	FORK(1, null, false, null), 
	GURU(2, null, true, null), 
	SEELIGHT(2, "See Light", true, null), 
	PITS(2, "Feel Draft", true, null), 
	SMALLCAVE(1, null, true, null), 
	STAIRS(1, null, false, null), 
	WATER(2, "Hear Splash", true, null), 
	WIZARD(2, "Hear Voices", true, null), 
	WAND(1, null, true, Item.WAND), 
	WORD(1, null, true, Item.WORD), 
	CAPE(1, null, true, Item.CAPE), 
	DIAMONDS(1, null, true, Item.DIAMONDS), 
	IVORY(1, null, true, Item.IVORY), 
	VASE(1, null, true, Item.VASE), 
	PEARLS(1, null, true, Item.PEARLS), 
	CRYSTAL(1, null, true, Item.CRYSTAL), 
	RUBIES(1, null, true, Item.RUBIES), 
	SILK(1, null, true, Item.SILK), 
	GOLD(1, null, true, Item.GOLD), 
	SILVER(1, null, true, Item.SILVER);

	
	public int numOccurrancces;
	
	public String warnMessage;
	
	public boolean wizardSight;
	
	public Item item;
	
	public int downLeft;
	
	public int upRight;

	private CaveType(int numOccurrancces, String warnMessage,
			boolean wizardSight, Item item) {
		this.numOccurrancces = numOccurrancces;
		this.warnMessage = warnMessage;
		this.wizardSight = wizardSight;
		this.item = item;

	}

	
	public int getNumOccurrancces() {
		return numOccurrancces;
	}
	
	
	public String getWarnMessage() {
		return warnMessage;
	}

	
	public boolean isWizardSight() {
		return wizardSight;
	}

	
	public int getDownLeft() {
		return downLeft;
	}

	public void setDownLeft(int downLeft) {
		this.downLeft = downLeft;
	}

	
	public int getUpRight() {
		return upRight;
	}

	public void setUpRight(int upRight) {
		this.upRight = upRight;
	}

	
	public Item getItem() {
		return item;
	}

}
