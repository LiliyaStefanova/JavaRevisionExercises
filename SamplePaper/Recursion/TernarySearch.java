package SamplePaper.Recursion;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 07/06/14
 * Time: 19:13
 * To change this template use File | Settings | File Templates.
 */
public class TernarySearch {


    public static int bin(int [] arr, int s, int e, int value){
        int m=(s+e)/2;

        if(s>e||s<e){
           return -1; //value not found
        }
        else{
            if(value>arr[m]){
                s=m+1;
                return bin(arr,s,e, value);
            }
            else if(value<arr[m]){
                e=m;
                return bin(arr, s, e, value);
            }
            else{    //value=arr[m]
                return m;
            }
        }
    }

    public static int ter(int [] arr, int s, int e, int value){

        int m=(s+e)/3;
        int m2=2*(s+e)/3;

        if(s>=e||e<=s){
            return -1;
        }
        else if(value==arr[m]){
            return m;
        }
        else if(value<arr[m]){
                return ter(arr, s, m, value);
            }
        else if(value>arr[m]&& value<arr[m2]){
                return ter(arr, m, m2, value);
            }
        else if(value>arr[m2]){
            return ter(arr,m2,e, value);
        }
        else{
                return m2;
            }
        }


    public static void main(String [] args){

        int [] arr={1,2,3,4,5,6};
        int [] arr1={1,2,3,4,5};
        int [] arr2={1,2,3,4};

        //System.out.println(bin(arr1, 0, arr1.length-1,0));
        //System.out.println(ter(arr, 0, arr.length-1,5));
        System.out.println(ter(arr, 0, arr.length-1,0));
    }
}
