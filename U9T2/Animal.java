public class Animal{
    private String name;
    private int age;
    private boolean vaccinated;

    public Animal(String name, int age, boolean vaccinated){
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean getVaccinated(){
        return vaccinated;
    }

    public void adopt(){
        System.out.println("I am now adopted");
    }

    public void feed(){
        System.out.println("I now got fuel");
    }

    public void isAnimal(){
        System.out.println("Of course I am an animal!");
    }
}