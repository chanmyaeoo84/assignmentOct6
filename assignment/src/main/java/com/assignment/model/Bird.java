package com.assignment.model;

import com.assignment.model.support.FlyBehavior;

public class Bird extends Animal {
	
	protected FlyBehavior flyBehavior;

	public Bird() {

	}

	public void fly() {
		flyBehavior.fly();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
}
