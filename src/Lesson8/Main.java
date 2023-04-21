package Lesson8;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Arthas");
        Dog dog = new Dog("Robert");
        BigDog bigdog = new BigDog("Atlant");
        Lion lion = new Lion("Simba");
        Wolf wolf = new Wolf("Akella");

        cat.greets();
        cat.play();
        cat.feed();
        System.out.println("================================");
        dog.greets();
        dog.play();
        dog.feed();
        System.out.println("================================");
        bigdog.greets();
        bigdog.greets(dog);
        bigdog.greets(bigdog);
        System.out.println("================================");
        lion.greets();
        lion.hunting();
        System.out.println("================================");
        wolf.greets();
        wolf.hunting();
        System.out.println("================================");
        anyAnimal(cat);
        anyAnimal(dog);
        anyAnimal(bigdog);
        anyAnimal(lion);
        anyAnimal(wolf);
    }
    public static void anyAnimal(Animal animal){
        System.out.println(animal.getName() + " says: hello!");
    }
}
