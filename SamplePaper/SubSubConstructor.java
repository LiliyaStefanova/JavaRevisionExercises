package SamplePaper;


public class SubSubConstructor extends SubConstructor {

    private String s;

    public SubSubConstructor() {
        super("item");
        s = super.s;
        x++;
        System.out.println("[6] [s = " + this.s + "] " + this);
        System.out.println("[7] "+"x= "+ super.x);
        System.out.println("[7] "+"s= "+ super.s);
    }
    public String toString() {
        return "******* " + super.toString();
    }


    public static void main(String [] args){

        SubSubConstructor ssc = new SubSubConstructor();

    }
}
