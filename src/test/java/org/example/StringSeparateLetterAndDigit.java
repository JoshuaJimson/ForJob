package org.example;

public class StringSeparateLetterAndDigit {

    //separate string between numbers letters and Special Character

    public static void main(String[] args){
        String st="abcd@12^%3efgh4)(56+";
        String letters=st.replaceAll("[^A-Za-z]","");
        String numbers=st.replaceAll("[^0-9]","");
        String specialChar=st.replaceAll("[A-Za-z0-9]","");
        System.out.println("Numbers in the String : "+numbers);
        System.out.println("Letters in the string : "+letters);
        System.out.println("Special Characters in the string : "+specialChar);
        System.out.println("********Method 2**********8");
        String st1="abcd@12^%3efgh4)(56+";
        String letters1="";
        String numbers1="";
        String specialChar1="";
        for(int i=0;i<st1.length();i++){
            if(Character.isAlphabetic(st1.charAt(i))){
                letters1=letters1+st1.charAt(i);
            }
            else if(Character.isDigit(st1.charAt(i))){
                numbers1=numbers1+st1.charAt(i);
            }
            else{
                specialChar1=specialChar1+st1.charAt(i);
            }
        }
        System.out.println("Numbers in the String : "+numbers1);
        System.out.println("Letters in the string : "+letters1);
        System.out.println("Special Characters in the string : "+specialChar1);

    }
}
