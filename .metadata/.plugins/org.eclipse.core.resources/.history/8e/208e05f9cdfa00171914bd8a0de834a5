package edu.pitt.helloanimals;

import java.util.*;

public class Animal {
	
	protected String age;
	protected String color;
	protected String type;
	protected static int weight;
	protected int minimumWeight;	
	
	public static void main(String[] args) {
		
		Mammal mammal = new Mammal("five", "brown", "mammal", 6, 5);
		Bird bird = new Bird("six", "red", "bird", 4, 3);
		Fish fish = new Fish("seven", "gold", "fish", 2, 1);
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		
		list.add(mammal);
		list.add(bird);
		list.add(fish);
		
		output(list);
	}
	
	public void animal(String age, String color, String type, int weight, int minimumWeight) {
		
	}
	
	public static int eat() {
		return (getWeight()+1);
	}
	
	public static int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public static void output(ArrayList list) {
		System.out.println(list);
		System.out.println(eat());
	}
}