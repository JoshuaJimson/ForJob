package org.example;

import org.testng.annotations.Test;

public class StringTest {
    @Test
    public void abc(){
        String testString="Please email us at mentor@rahulshettyacademy.com with below template to receive response";
        String emailId = testString.split("at")[1].trim().split(" ")[0];
        System.out.println(emailId);
        System.out.println("Below is the step by step execution");
        System.out.println(testString.split("at")[0]);
        System.out.println(testString.split("at")[1]);
        System.out.println(testString.split("at")[1].trim());
        System.out.println(testString.split("at")[1].trim().split(" ")[0]);
    }
}
