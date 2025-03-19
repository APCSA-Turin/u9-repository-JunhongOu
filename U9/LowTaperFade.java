public class LowTaperFade extends Memes{
    private String haircut;

    public LowTaperFade(String name, Boolean funny, String haircut){
        super(name, funny);
        this.haircut = haircut;
    }

    public String ninjaLowTaperFade(){
        return "Imagine if  you got a " + haircut;
    }

    public void ninjaQuote(){
        System.out.println("The low taper fade meme is still massive");
    }
}