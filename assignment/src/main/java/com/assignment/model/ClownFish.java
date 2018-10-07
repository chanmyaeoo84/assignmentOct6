package com.assignment.model;

import com.assignment.enums.Size;

public class ClownFish extends Fish {
	public ClownFish(){
		size=Size.SMALL;
		color="Orange";
	}
	
	public void joke(){
		System.out.println("Clownfishes make jokes.");
	}
}
