package inheritance;

public class InheritanceExample {
	
	public static void makeItTalk(Animal input) {
		input.speak();
	}
	
	public static void main(String[] args) {
		
		Animal myAnimal = new Animal();
		Dog myDog = new Dog();
		
		System.out.println("Make the Animal object speak:");
		makeItTalk(myAnimal);
		
		System.out.println("Make the Dog object speak:");
		
	}

}

class Animal() {
	public void speak() {
		System.out.println("Generic animal noise!");
		
	}
}

class Dog extends Animal {
	
	
}