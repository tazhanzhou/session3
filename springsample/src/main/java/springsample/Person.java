package springsample;

public class Person {
	String firstName;
	int age;
	
	public Person() {
	
	}
	
	public Person(int passAgeValue, String nameOfPerson) {
		this.age = passAgeValue;
		this.firstName = nameOfPerson;
	}
	
	public void showMessage() {
		System.out.println("I am a person, my name is "+ this.firstName+", and I am "+this.age+" years old.");
	}
}
