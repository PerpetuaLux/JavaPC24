package Java24;

//import static test.testinit.*;

import java.util.Arrays;
import java.util.*;
import java.io.*;

class Test{
//    public static void main(String[] args) {
//        System.out.println("My speed is " + speed + ", my age is " + age 
//                + " and the time is " + time);
//        //testing the thing
//        double pi = Math.PI;
//        System.out.println(pi);
//    }
//    public static void main(String[] args) {
//        double result = MyMath.multadd(1, 2, 3);
//        System.out.println(result);
//        
//        result = MyMath.multadd(1, Math.sin(Math.PI/4), Math.cos((Math.PI/4)/2));
//        System.out.println(result);
//        result = Math.sin(Math.PI/4) + Math.cos((Math.PI/4)/2);
//        System.out.println(result);
//        result = Math.log(10) + Math.log(20);
//        System.out.println(result);
//        System.out.println(MyMath.ack(3, 10));
//        System.out.print("Is my math good math: ");
//        if (MyMath.pow(-13, -10) == Math.pow(-13, -10)) {
//            System.out.println("Yes");
//        } else System.out.println("No");
//    }
//    public static void main(String[] args) {
//        double result = MyMath.sqrt(1240);
//        double result2 = Math.sqrt(1240);
//        System.out.println(result);
//        System.out.println(result2);
//    }
    
//    public static void main(String[] args) {
//        double result = MyMath.powI(12, 13);
//        double result2 = MyMath.pow(12, 13);
//        double result3 = Math.pow(12, 13);
//        System.out.println(result);
//        System.out.println(result2);
//        System.out.println(result3);
//    }
    
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner in = new Scanner(new FileReader("C:\\Users\\Jonathan\\Dropbox (Lux Software)\\Lux Software Team Folder\\Learning Project\\JavaPC24\\src\\Java24\\test.in"));
//        String output = in.nextLine();
//        System.out.println(output);
//        String output2 = in.nextLine();
//        System.out.println(output2);
//    }
    public static void main(String[] args) {
        int[] a = MyMath.randomArray(50);
        int[] test = MyMath.histogram(a, 5);
        System.out.println(Arrays.toString(test));
    }
}