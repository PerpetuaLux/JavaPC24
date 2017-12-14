package Java24;

//import static test.testinit.*;
class test{
//    public static void main(String[] args) {
//        System.out.println("My speed is " + speed + ", my age is " + age 
//                + " and the time is " + time);
//        //testing the thing
//        double pi = Math.PI;
//        System.out.println(pi);
//    }
    public static void main(String[] args) {
        double result = MyMath.multadd(1, 2, 3);
        System.out.println(result);
        
        result = MyMath.multadd(1, Math.sin(Math.PI/4), Math.cos((Math.PI/4)/2));
        System.out.println(result);
        result = Math.sin(Math.PI/4) + Math.cos((Math.PI/4)/2);
        System.out.println(result);
        result = Math.log(10) + Math.log(20);
        System.out.println(result);
        System.out.println(MyMath.ack(3, 10));
        System.out.print("Is my math good math: ");
        if (MyMath.pow(-13, -10) == Math.pow(-13, -10)) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}