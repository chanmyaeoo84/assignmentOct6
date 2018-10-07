package com.assignment.model;

import com.assignment.enums.Size;

public class Shark extends Fish {
	
	public Shark(){
		size=Size.LARGE;
		color="Grey";
	}
	
	public void eatFish(){
		System.out.println("Sharks eat fishes.");
	}
}
