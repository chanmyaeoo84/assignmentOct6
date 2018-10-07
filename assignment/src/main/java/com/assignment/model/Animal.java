package com.assignment.model;

import com.assignment.model.support.SingBehavior;
import com.assignment.model.support.SwimBehavior;
import com.assignment.model.support.WalkBehavior;

/**
 * Animal Base class
 * 
 * @author Chan Myae Oo
 *
 */
public abstract class Animal {
	protected SingBehavior singBehavior;
	protected WalkBehavior walkBehavior;
	protected SwimBehavior swimBehavior;
	
	public Animal() {
		setSwimBehavior(new NormalSwim());
	}

	public void walk() {
		walkBehavior.walk();
	}

	public void sing() {
		singBehavior.sing();
	}
	
	public void swim() {
		swimBehavior.swim();
	}

	public void setSingBehavior(SingBehavior singBehavior) {
		this.singBehavior = singBehavior;
	}

	public void setWalkBehavior(WalkBehavior walkBehavior) {
		this.walkBehavior = walkBehavior;
	}

	public void setSwimBehavior(SwimBehavior swimBehavior) {
		this.swimBehavior = swimBehavior;
	}
}
