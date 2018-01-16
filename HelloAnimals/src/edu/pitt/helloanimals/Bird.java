/*
 * Mark Szymanski
 * 1/16/2018
 * INFSCI 1017
 * Assignment 1
 * Bird.java
 */

package edu.pitt.helloanimals;

public class Bird extends Animal {

	public Bird(String age, String color, int weight, int minimumWeight) {
		super.Animal(age, color, "bird", weight, minimumWeight);
	}
	
	public int fly() {
		return (getWeight()-2);
	}
}