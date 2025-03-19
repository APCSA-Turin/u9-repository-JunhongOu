public class Test {
    public static void main(String[] args) {
       
        Animal animal1 = new Animal("hippo", 99, true);
        System.out.println(animal1.getName());
        System.out.println(animal1.getAge());
        System.out.println(animal1.getVaccinated());
        animal1.adopt();
        animal1.feed();
        animal1.isAnimal();

        Dog dog = new Dog("Sonic", 25, true, true);
        System.out.println(dog.hasBeenWalked());
        dog.adopt();
        dog.feed();
        dog.isAnimal();
        dog.walk();
        dog.dogTreat();

        Cat cat = new Cat("Beluga", 30, true, true);
        System.out.println(cat.getHasPlayedWith());
        cat.adopt();
        cat.feed();
        cat.isAnimal();
        cat.play();
        cat.fish();

    }
}
