package org.example;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = s.nextLine();
        System.out.println("String is        :   " + st);
        StringBuilder test = new StringBuilder(st);
        st=test.reverse().toString();
        System.out.println("String reverse is:   "+st);
        String[] words=st.split(" ");
        System.out.print("reversing each word: ");
        for(int i=0;i<words.length;i++) {
            StringBuilder str = new StringBuilder(words[i]);
            System.out.print(str.reverse()+" ");
        }
        System.out.println();
        System.out.println("****Method 2*****for reversing");
        String rev = "";
        String[] words1 = st.split(" ");
        for (int i = words1.length - 1; i >= 0; i--) {
            rev=rev+words1[i]+" ";
        }
        System.out.println(rev);
    }

}
