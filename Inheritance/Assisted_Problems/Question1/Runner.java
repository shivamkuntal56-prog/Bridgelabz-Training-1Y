package Assisted_Problems.Question_1;

public class Runner {
    public static void main(String[] args) {
        Animal a1 = new Dog("dog",5);
        Animal a2 = new Cat("kitty",5);
        Animal a3 = new Bird("bird",3);
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
