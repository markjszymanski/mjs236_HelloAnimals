/*
 * Mark Szymanski
 * 1/16/2018
 * INFSCI 1017
 * Assignment 1
 * Mammal.java
 */

package edu.pitt.helloanimals;

public class Mammal extends Animal {

	public Mammal(String age, String color, int weight, int minimumWeight) {
		super.Animal(age, color, "mammal", weight, minimumWeight);
	}
	
	public int run() {
		return (getWeight()-1);
	}
}