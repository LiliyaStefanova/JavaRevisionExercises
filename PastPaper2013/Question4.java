package PastPaper2013;


public class Question4 {

    public void computeSums(){
        int inrangeSum=0;
        int outofRangeSum=0;
        boolean finished=false;
        System.out.print("Enter top of range: ");
        int top=Integer.parseInt(System.console().readLine());
        System.out.print("Enter bottom of range: ");
        int bottom=Integer.parseInt(System.console().readLine());
        do{
            System.out.print("Enter number: ");
            int number=Integer.parseInt(System.console().readLine());
            if(number==0){
                finished=true;
            }
            if(number<top && number>bottom){
                inrangeSum=inrangeSum+number;
            }
            else{
                outofRangeSum=outofRangeSum+number;
            }
        }while(!finished);

        System.out.println("Sum of in range values: "+inrangeSum);
        System.out.println("Sum of out of range values: "+ outofRangeSum);
    }

    public static void main(String [] args){
        Question4 newQ=new Question4();
        newQ.computeSums();
    }
}
