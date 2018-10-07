package com.assignment.model;

import com.assignment.model.support.SingBehavior;

/**
 * Animal Base class
 * 
 * @author Chan Myae Oo
 *
 */
public class Animal {
	protected SingBehavior singBehavior;
	
	public Animal() {

	}

	public void walk() {
		System.out.println("I am walking.");
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
}
