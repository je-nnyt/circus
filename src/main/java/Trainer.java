public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting by doing (Bird) d so treating d as a bird
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting, treating b as an animal
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

        train(new Duck());
        train(new Parrot());

    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck){
            Duck d = (Duck) bird;
            d.swim();
        } else {
            System.out.println("I'm not a Duck; I'm not a Duck");
        }
    }
}
