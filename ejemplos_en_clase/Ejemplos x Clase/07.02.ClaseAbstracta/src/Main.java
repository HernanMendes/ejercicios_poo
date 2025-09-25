// Clase abstracta Animal
abstract class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Método concreto
    public String getName() {
        return name;
    }

    // Métodos abstractos
    public abstract void makeSound();
    public abstract void eat();
}

// Clase Dog que extiende la clase abstracta Animal
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Eating dog food");
    }
}

// Clase Cat que extiende la clase abstracta Animal
class Cat extends Animal {
    // Constructor
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Eating cat food");
    }
}

// Clase principal para probar las clases abstractas
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        System.out.println("Dog's name: " + myDog.getName());
        myDog.makeSound();
        myDog.eat();

        System.out.println("Cat's name: " + myCat.getName());
        myCat.makeSound();
        myCat.eat();
    }
}
