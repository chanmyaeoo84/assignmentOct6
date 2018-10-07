package com.assignment.solution;

import com.assignment.model.Animal;
import com.assignment.model.Bird;
import com.assignment.model.support.BirdFlying;
import com.assignment.model.support.BirdSinging;

public class Solution {
	public static void main(String[] args) {
		Animal bird = new Bird();
		bird.walk();
		
		((Bird) bird).setFlyBehavior(new BirdFlying());
		((Bird) bird).fly();

		bird.setSingBehavior(new BirdSinging());
		bird.sing();
	}
}
