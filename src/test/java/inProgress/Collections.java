package inProgress;

import java.util.*;

public class Collections {
    public static void main(String[] args){
        System.out.println("Hello World");
        Integer[] arrayElements1 ={5,2,7,4,1,1};
        List a1= Arrays.asList(arrayElements1);
        System.out.println("List 1 "+a1);
        List a2=new ArrayList();
        Integer[] arrayElements2 ={8,4,0,2,9};
        a2=Arrays.asList(arrayElements2);
        System.out.println("List 2 "+a2);
        List a3=new ArrayList(Arrays.asList(arrayElements2));
        System.out.println("List 3 "+a3);
        Integer[] arrayElements3 ={9,8,8,5,2,7,4,1,1};
        Set set = new HashSet(Arrays.asList(arrayElements3));
        System.out.println("Set 1 "+set);
        Set set2=new HashSet();
        set2.addAll(a3);
        set2.add(3);
        System.out.println("Set 2 "+set2);
    }
}
