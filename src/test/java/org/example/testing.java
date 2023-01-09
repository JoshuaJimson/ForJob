package org.example;

public class testing {
    public static void main(String[] args) {
    String a="firstv round interview ";
    String find="view";
    int j=0;
    char[] str=a.toCharArray();
    char[] fd=find.toCharArray();

    for(int i=0;i< str.length;i++){
        System.out.println(i);
        while(j<fd.length){
            if(str[i]==fd[j]){
                i=i+1;
                j=j+1;
            }
            else{
                j=0;
                break;
            }
            if(j==fd.length){
                System.out.println("pass");
            }
        }

    }
    }
}
