public class Cat implements Animal {
    private String name;

    // Constructor
    public Cat(String name) {
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println("Miauuuuu");
    }

    @Override
    public void eat() {
        System.out.println("Eating CAT meal");
    }
    public String getName() {
        return this.name;
    }
}
