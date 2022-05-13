package dev.sample;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Person[] persons = new Person[] {new Person("A",1), new Person("B",1)};
		
		for ( Person person : persons) {
			System.out.println(person.getName()+" "+person.getAge());
		}
		
	}

}
