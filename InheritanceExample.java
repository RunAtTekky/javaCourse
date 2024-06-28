class Animal {
    public void eat() {
        System.out.println("Eating.");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Meowing.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Barking.");
    }
}

class Kitten extends Cat {
    public void weep() {
        System.out.println("Weeping.");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        System.out.println("Varun Rawat (22BCE10512)");

        Cat catto = new Cat();
        Kitten kitty = new Kitten();
        Dog doggo = new Dog();

        // Single Inheritance | Animal -> Cat
        catto.meow();
        catto.eat();

        // Multi-level Inheritance | Animal -> Cat -> Kitten
        catto.meow();
        kitty.meow();

        catto.eat();
        kitty.eat();

        kitty.weep();

        // Hierarchical Inheritance | Animal -> Cat && Animal -> Dog
        /*
        Animal
        |   |
        Cat Dog
         */
        catto.meow();
        doggo.bark();

        catto.eat();
        doggo.eat();
    }
}
