package SamplePaper.Recursion;


public class Mystery {

    static int mystery(int n, int m, int p){
        int i, result = 0;

    if (p==0)
    {return n+m;
        }
    for (i=0; i< m; i++) {
        result+= mystery(result,n,p-1);
        }
        return result;
    }


    public static void main(String [] args){

        System.out.println(mystery(3,2,2));
    }

}