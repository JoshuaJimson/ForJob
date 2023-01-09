package inProgress;

public class StringSpace {
    public static void main(String[] args) {
        String a = "I am a good boy";
        String b = a.replace(" ", "");
        System.out.println("removing spaces Method One \n" + b);
        String rev = "";
        for (int i = 0; i < a.length(); i++) {
            char t = a.charAt(i);
            rev = t + rev;     //important..learn how it works
        }
        System.out.println("reverse of string: \n" + rev);
        System.out.println("removing spaces Method 2");
        System.out.println(removeSpace(a));
        System.out.println(removeSpace(rev));

    }

    public static String removeSpace(String a) {
        String temp = "";
        for (int i = 0; i < a.length(); i++) {
            char t = a.charAt(i);
            if (t == ' ') {
                continue;
            }
            temp = temp + t;
        }
        return temp;
    }
}
