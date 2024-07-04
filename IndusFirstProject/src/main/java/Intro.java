class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}

public class Intro {
	public static void main(String[] args) {
		Animal myDog = new Dog();
		myDog.sound();
	}
}
