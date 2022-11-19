// polymorphism - poly = many and morph = forms
// ex. a man is father of someone, brother of someone, brother of someone
public class polymorphism {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        Animal c = new Pig();
        a.animalSound();
        b.animalSound();
        c.animalSound();
    }
}

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
