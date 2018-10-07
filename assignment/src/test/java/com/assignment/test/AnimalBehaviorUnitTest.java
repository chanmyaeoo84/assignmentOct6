package com.assignment.test;

import org.junit.Test;

import com.assignment.model.Animal;
import com.assignment.model.Bird;
import com.assignment.model.Chicken;
import com.assignment.model.Duck;
import com.assignment.model.Fish;
import com.assignment.model.Parrot;
import com.assignment.model.Rooster;
import com.assignment.model.support.BirdSinging;
import com.assignment.model.support.Cluck;
import com.assignment.model.support.CockDoodle;
import com.assignment.model.support.Meow;
import com.assignment.model.support.NoFly;
import com.assignment.model.support.NoSing;
import com.assignment.model.support.NoWalk;
import com.assignment.model.support.Quack;
import com.assignment.model.support.Woof;

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
	
	/**
	 * Method to test sing() method of Duck
	 */
	@Test
	public void testDuckSinging(){
		Bird duck=new Duck();
		duck.setSingBehavior(new Quack());
		duck.sing();
	}
	
	/**
	 * Method to test swim() method of Duck
	 */
	@Test
	public void testDuckSwimming(){
		Bird duck=new Duck();
		duck.swim();
	}
	
	/**
	 * Method to test sing() method of Chicken
	 */
	@Test
	public void testChickenSinging(){
		Bird chicken=new Chicken();
		chicken.setSingBehavior(new Cluck());
		chicken.sing();
	}
	
	/**
	 * Method to test fly() method of Chicken
	 */
	@Test
	public void testChickenFlying(){
		Bird chicken=new Chicken();
		chicken.setFlyBehavior(new NoFly());
		chicken.fly();
	}
	
	/**
	 * Method to test sing() method of Rooster
	 */
	@Test
	public void testRoosterSinging(){
		Chicken rooster=new Rooster();
		rooster.setSingBehavior(new CockDoodle());
		rooster.sing();
	}
	
	/**
	 * Method to test sing() method of Parrot living with dogs
	 */
	@Test
	public void testParrotLiveDogSinging(){
		Bird parrot=new Parrot();
		parrot.setSingBehavior(new Woof());
		parrot.sing();
	}
	
	/**
	 * Method to test sing() method of Parrot living with cats
	 */
	@Test
	public void testParrotLiveCatSinging(){
		Bird parrot=new Parrot();
		parrot.setSingBehavior(new Meow());
		parrot.sing();
	}
	
	/**
	 * Method to test sing() method of Parrot living near rooster
	 */
	@Test
	public void testParrotLiveRoosterSinging(){
		Bird parrot=new Parrot();
		parrot.setSingBehavior(new CockDoodle());
		parrot.sing();
	}
	
	/**
	 * Method to test sing() method of Fish
	 */
	@Test
	public void testFishSinging(){
		Animal fish=new Fish();
		fish.setSingBehavior(new NoSing());
		fish.sing();
	}
	
	/**
	 * Method to test walk() method of Fish
	 */
	@Test
	public void testFishWalking(){
		Animal fish=new Fish();
		fish.setWalkBehavior(new NoWalk());
		fish.walk();
	}
	
	/**
	 * Method to test swim() method of Fish
	 */
	@Test
	public void testFishSwimming(){
		Animal fish=new Fish();
		fish.swim();
	}
	
}
