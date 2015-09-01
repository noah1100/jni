package test;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8665004624988847871L;
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(int age) {
		this.age = age;
	}
	public Person() {
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public String toString(){
		return "person=>age:"+this.age+",name:"+this.name;
	}
}
