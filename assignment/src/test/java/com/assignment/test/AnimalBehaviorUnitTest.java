package com.assignment.test;

import org.junit.Test;

import com.assignment.model.Animal;
import com.assignment.model.Bird;
import com.assignment.model.support.BirdSinging;

/**
 * Test class for Animal Behavior
 * 
 * @author Chan Myae Oo
 *
 */
public class AnimalBehaviorUnitTest {
	
	/**
	 * Method to test sing() method of Bird
	 */
	@Test
	public void testBirdSinging(){
		Animal bird=new Bird();
		bird.setSingBehavior(new BirdSinging());
		bird.sing();
	}
	
}
