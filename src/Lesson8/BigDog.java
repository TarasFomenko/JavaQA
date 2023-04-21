package Lesson8;

public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        super.greets();
    }

    @Override
    void greets(Dog dog) {
        super.greets(dog);
    }

    void greets (BigDog bigDog){
        System.out.println("I'm a big dog and I say Wooooooooooooooof!");
    }


}
