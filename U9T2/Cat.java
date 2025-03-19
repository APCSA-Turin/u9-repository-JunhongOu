public class Cat extends Animal{
    private boolean hasPlayedWith;

    public Cat(String name, int age, boolean vaccinated, boolean hasPlayedWith){
        super(name, age, vaccinated);
        this.hasPlayedWith = hasPlayedWith;
    }

    public boolean getHasPlayedWith(){
        return hasPlayedWith;
    }

    public void play(){
        System.out.println("Lets play MEOW MEOW");
    }

    public void fish(){
        System.out.println("I want fish");
    }
}
