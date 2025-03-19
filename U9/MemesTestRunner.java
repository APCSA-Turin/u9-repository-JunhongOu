public class MemesTestRunner{
    public static void main(String[] args) {
        Memes funny = new Memes("rickroll", true);
        System.out.println(funny.getName());
        System.out.println(funny.isFunny());
        System.out.println(funny.isVeryUnfunny());
        
        LowTaperFade why = new LowTaperFade("gigachad", true, "high taper fade");
        System.out.println(why.ninjaLowTaperFade());
        why.ninjaQuote();
        why.getName();
        why.isFunny();
        why.isVeryUnfunny();
        System.out.println(why.getName());
        System.out.println(why.isFunny());
        System.out.println(why.isVeryUnfunny());

        SkibidiToilet no = new SkibidiToilet("nullToilet", false, true);
        System.out.println(no.isUnfunny());
        no.noSkibidiToilet();
        System.out.println(no.getName());
        System.out.println(no.isFunny());
        System.out.println(no.isVeryUnfunny());
        
    }
}