/*
 * Mark Szymanski
 * 1/16/2018
 * INFSCI 1017
 * Assignment 1
 * Animal.java
 */

package edu.pitt.helloanimals;

import java.util.*;

public class Animal {
	
	protected String age;
	protected String color;
	protected String type;
	protected int weight;
	protected int minimumWeight;	
	
	public static void main(String[] args) {
		
		Mammal dog = new Mammal("five", "black", 25, 15);
		dog.eat();
		dog.run();
		
		Bird eagle = new Bird("six", "brown", 10, 5);
		eagle.eat();
		eagle.fly();
		
		Fish salmon = new Fish("three", "pink", 8, 4);
		salmon.eat();
		salmon.swim();
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		animalList.add(dog);
		animalList.add(eagle);
		animalList.add(salmon);
	
		//used to print out results in a legible manner
		int i = 0;
		while (i < animalList.size()) 
		{ 
			System.out.println(animalList.get(i));
			i++;
		}
	}
	
	public void Animal(String age, String color, String type, int weight, int minimumWeight) {
		this.age = age;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.minimumWeight = minimumWeight;
	}
	
	public int eat() {
		return (getWeight()+1);
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//used to print results from arraylist
	//i honestly need to figure out exactly how and why this works
	public String toString() {
		return("This Animal is " + age + " years old, weighs " + weight + " pounds, has a minimum weight of " + minimumWeight + ", and is " + color + ".\n");
	}
}