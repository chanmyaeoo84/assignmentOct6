package com.assignment.model;

import com.assignment.model.support.SingBehavior;
import com.assignment.model.support.WalkBehavior;

/**
 * Animal Base class
 * 
 * @author Chan Myae Oo
 *
 */
public class Animal {
	protected SingBehavior singBehavior;
	protected WalkBehavior walkBehavior;
	
	public Animal() {

	}

	public void walk() {
		walkBehavior.walk();
	}

	public void sing() {
		singBehavior.sing();
	}
	
	public void swim() {
		System.out.println("I am swimming.");
	}

	public void setSingBehavior(SingBehavior singBehavior) {
		this.singBehavior = singBehavior;
	}

	public void setWalkBehavior(WalkBehavior walkBehavior) {
		this.walkBehavior = walkBehavior;
	}
}
