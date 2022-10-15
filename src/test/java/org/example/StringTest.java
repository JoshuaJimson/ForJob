package org.example;

public class StringTest {
    public static void main(String[] args){
        String testString="Please email us at mentor@rahulshettyacademy.com with below template to receive response";
        //String emailId = testString.split("at")[1].trim().split(" ")[0];
        System.out.println(testString.split("at")[0]);
        System.out.println(testString.split("at")[1]);
        System.out.println(testString.split("at")[1].trim());
        System.out.println(testString.split("at")[1].trim().split(" ")[0]);
    }
}
