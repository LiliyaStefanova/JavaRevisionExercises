package SamplePaper;

public class Interval {

    private int lower;
    private int upper;

    public Interval(int lower, int upper) throws OutOfRangeException{
        if(lower>upper){
            throw new OutOfRangeException("Lower higher than upper range");
        }
        this.lower=lower;
        this.upper=upper;
    }

    public void in(int num) throws OutOfRangeException{
        if(num<lower|| num>upper){
            throw new OutOfRangeException("Number not in range");
        }
        else{
            System.out.println("Number in range");
        }
    }

    public static void testInterval(int low, int high, int val){
        try{
            Interval a=new Interval(low, high);
            a.in(val);
        }catch(OutOfRangeException ex){
            System.out.println(ex.getReason());
        }

    }

    public static void main(String [] args){
        testInterval(5,8,2);
    }

}