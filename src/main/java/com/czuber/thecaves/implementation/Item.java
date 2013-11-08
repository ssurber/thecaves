package com.czuber.thecaves.implementation;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public enum Item {

	KEYS 	(0, true),
	WATER 	(0, true),
	KNIFE 	(0, true),
	GLOVES 	(0, true),
	LAMP 	(0, true),
    WAND 	(0, false),
	CAPE 	(0, false),
	WORD   	(0, false),
	DIAMONDS (100, false),
	IVORY 	(100, false),
	VASE 	(100, false),
	PEARLS 	(100, false),
	CRYSTAL (100, false),
	RUBIES 	(150, false),
	SILK 	(150, false),
	GOLD 	(200, false),
	SILVER 	(200, false);
	
	public int score;
	public boolean isStealable;
	
	private Item(int score, boolean stealable){
		this.score = score;
		this.isStealable = stealable;
	}

	
	public int getScore() {
		return score;
	}


	public boolean isStealable() {
		return isStealable;
	}
}
