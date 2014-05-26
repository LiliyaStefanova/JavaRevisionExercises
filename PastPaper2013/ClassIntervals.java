package PastPaper2013;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 2013 9b
 */
public class ClassIntervals {

    private Integer [] sample=new Integer[30];

    private Map<Integer, Integer> distribution=new HashMap<Integer, Integer>();

    public ClassIntervals(Integer [] sample){
        this.sample=sample;
        for(int value: distribution.keySet()){
            distribution.put(value,0);
        }
    }

    public Map<Integer, Integer> classIntervalsCompute(Integer [] sample){
        //This has been fixed as per Keith's suggestion-had a lot of if statements before
        for(Integer var:sample){
            Integer temp=0;
            Integer slot=var/10;
            if(distribution.containsKey(slot)){
                temp=distribution.get(slot);
            }
                distribution.put(slot, temp+1);

        }
        return distribution;

    }

    public boolean isSymmetrical(){
        int firstHalf=0;
        int secondHalf=0;
        for(int var: distribution.keySet()){
            if(var<=4){
                firstHalf=firstHalf+distribution.get(var);
            }
            else{
                secondHalf=secondHalf+distribution.get(var);
            }
        }
        return (firstHalf<=2*secondHalf)||(secondHalf<=2*firstHalf);
    }

    public  void prettyPrint(Map<Integer, Integer> map){
        for(Integer key: map.keySet()){

            System.out.println("Class interval: "+ key+ " ||"+"Freq dist is: "+ map.get(key));
        }
    }

    public static void main(String [] args){

       int [] sample={1,5,10,45,25,5,35,67,1,1,98,1,55, 43, 56, 56, 67};
       Integer [] sample2={1,5,20,30,60,60,60,70};
       ClassIntervals ci=new ClassIntervals(sample2);
       ci.prettyPrint(ci.classIntervalsCompute(sample2));
        System.out.println(ci.isSymmetrical());
    }

}
