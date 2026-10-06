abstract class Animal9 {
    abstract void eat();
    abstract void sleep();
}

class Lion9 extends Animal9 {
    void eat() {
        System.out.println("Lion eats meat");
    }

    void sleep() {
        System.out.println("Lion sleeps in its den");
    }
}

class Tiger9 extends Animal9 {
    void eat() {
        System.out.println("Tiger eats meat");
    }

    void sleep() {
        System.out.println("Tiger sleeps in the jungle");
    }
}

class Deer9 extends Animal9 {
    void eat() {
        System.out.println("Deer eats grass");
    }

    void sleep() {
        System.out.println("Deer sleeps in the forest");
    }
}

public class Q9Animal {
    public static void main(String[] args) {
        Lion9 l = new Lion9();
        Tiger9 t = new Tiger9();
        Deer9 d = new Deer9();

        l.eat();
        l.sleep();

        t.eat();
        t.sleep();

        d.eat();
        d.sleep();
    }
}