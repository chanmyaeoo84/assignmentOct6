package com.assignment.model;

import com.assignment.enums.Size;

public class Fish extends Animal {
	
	protected Size size;
	protected String color;
	
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
