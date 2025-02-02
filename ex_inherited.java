// Parent Class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor: " + name);
    }

    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Child Class
class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); // Parent class Constructor-ஐ அழைக்கிறது
        this.breed = breed;
        System.out.println("Dog Constructor: " + breed);
    }

    void display() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
        super.makeSound(); // Parent class method-ஐ அழைக்கிறது
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy", "Golden Retriever");
        d.display();
    }
}
