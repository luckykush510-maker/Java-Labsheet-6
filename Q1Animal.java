class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat barks");
    }
}

public class Q1Animal {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}