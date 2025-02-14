package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck("Donald");
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting by doing (Bird) d so treating d as a bird
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting, treating b as an animal
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

<<<<<<< HEAD:src/main/java/Trainer.java
        train(new Duck());
        train(new Parrot());

=======
        train(new Duck("Daisy"));
        // train(new animal.Parrot());
>>>>>>> ca530b1e1f029e66196d2b8f2dc0d2cd8aab7c96:src/main/java/circus/Trainer.java
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
<<<<<<< HEAD:src/main/java/Trainer.java
        if (bird instanceof Duck){
            Duck d = (Duck) bird;
            d.swim();
        } else {
            System.out.println("I'm not a Duck; I'm not a Duck");
=======
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
>>>>>>> ca530b1e1f029e66196d2b8f2dc0d2cd8aab7c96:src/main/java/circus/Trainer.java
        }
    }
}
