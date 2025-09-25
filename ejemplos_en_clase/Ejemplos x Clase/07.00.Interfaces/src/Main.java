import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Perro Mio");
        Animal myCat = new Cat("Fido Dido");
        myDog.makeSound();
        myDog.eat();
        System.out.println("El Perro se llama " + myDog.getName());

        myCat.makeSound();
        myCat.eat();
        PrintStream printf = System.out.printf("Mi gato se llama %s%n", myCat.getName());

    }
}

