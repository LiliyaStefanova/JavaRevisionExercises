package PastPaper2013;

import java.util.HashMap;
import java.util.Map;

/**
 * Q9 a
 */
public class FrequencyDistribution {

    private Integer [] sample=new Integer[30];

    private Map<Integer, Integer> distribution=new HashMap<Integer, Integer>();

    public FrequencyDistribution(Integer [] sample){
        this.sample=sample;
    }


    public Map<Integer, Integer> compute(Integer [] sample){

        for(Integer var: sample){
            int temp=0;
            if(distribution.containsKey(var)){
                temp=distribution.get(var);
            }
            distribution.put(var, temp+1);
        }

        return distribution;
    }

    public  void prettyPrint(Map<Integer, Integer> map){
        for(Integer key: map.keySet()){

            System.out.println("Variable is: "+ key+ " ||"+"Freq dist is: "+ map.get(key));
        }
    }

    public static void main(String [] args){

        Integer [] sample={1,5,10,45,5,67,1,1,98,1};
        FrequencyDistribution fd=new FrequencyDistribution(sample);
        fd.prettyPrint(fd.compute(sample));

    }

}
