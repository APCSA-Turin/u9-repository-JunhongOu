public class SkibidiToilet extends Memes{
    private Boolean unfunny = true;
    
    public SkibidiToilet(String name, Boolean funny, Boolean unfunny){
        super(name, unfunny);
        this.unfunny = unfunny;
    }
    
    public boolean isUnfunny(){
        return unfunny;
    }

    public void noSkibidiToilet(){
        System.out.println("NEVER TALK ABOUT SKIBIDI TOILET AGAIN");
    }
}