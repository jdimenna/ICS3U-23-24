package lesson3;

public class ExampleThree {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;
        double a = 7.0;
        double b = 2;


        // If about operands are int, we get an int
        // If one of the operands are double, we get a double

        System.out.println(x+y); // int + int = int
        System.out.println(a+b); // double + dounle = double
        System.out.println(x+b); // int + double = double 

        System.out.println(x/y); // int/int = int 7/2 = 3.5 <- not an int, java will drop the .5, will not round
        System.out.println(a/b); //double/double = double <- will get decimal as it is a double
        System.out.println(x/b); // int/double = double <- has double, will show decimal
        System.out.println(y/x); // 2/7 <- will be less than 0, will show 0 as it is an int
    }
}
