package Arrays;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String [] args){

        boolean found=false;
        int [] values={1,5,11,25,9,3};
        Arrays.sort(values);

        int low=0;
        int high=values.length-1;
        int pos=0;
        int searchedNumber=11;

        while(low<=high&&!found){
            pos=(low + high)/2;
            if(values[pos]>searchedNumber){
                high=pos-1;
            }
            else if(values[pos]<searchedNumber){
                low=pos+1;
            }
            else{
                found=true;
            }
        }

        if(found) {
            System.out.println("Found at position: "+ pos);
        }
        else{
            System.out.println("Not found. Insert before position "+ pos);
        }
    }
}
