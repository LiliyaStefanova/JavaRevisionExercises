package SamplePaper;

/**
 * Created with IntelliJ IDEA.
 * User: liliya
 * Date: 17/05/14
 * Time: 18:29
 * To change this template use File | Settings | File Templates.
 */
//state the output produced

import java.util.ArrayList;

public class ArrayListTest {

        public static void main(String[] args) {
            String Str1 = "String 1";
            String Str2 = "String 2";
            String Str3 = "String 3";

            ArrayList al = new ArrayList();
            ArrayList alal = new ArrayList();

            al.add(Str1);
            alal.add(al);

            al.clear();
            al.add(Str2);
            alal.add(Str3);

            al.add(Str3);
            alal.add(al);
            al.add(Str1);
            alal.add(al);

            for (Object arrays : alal)
                System.out.println(arrays);
    }


}
