package org.example;

public class CalcFunctions {
    public int result = 0;

    public int add(int num1,int num2) {
        result=num1+num2;
        return result;
    }
    public int sub(int num1,int num2) {
        result=num1-num2;
        return result;
    }
    public int div(int num1,int num2) {
        result=num1/num2;
        return result;
    }
    public int mul(int num1,int num2) {
        result=num1*num2;
        return result;
    }
    public int mod(int num1,int num2) {
        result=num1%num2;
        return result;
    }
}
