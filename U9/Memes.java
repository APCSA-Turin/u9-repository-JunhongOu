public class Memes{
    private String name;
    private Boolean funny;

    public Memes(String name, Boolean funny){
        this.name = name;
        this.funny = funny;
    }

    public String getName(){
        return name;
    }

    public boolean isFunny(){
        funny = true;
        return funny;
    }

    public boolean isVeryUnfunny(){
        funny = false;
        return funny;
    }
}