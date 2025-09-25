public class Dog implements Animal {
    private String name;

    // Constructor
    public Dog(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Eating dog food");
    }

    public String getName() {
        return this.name;
    }


}
