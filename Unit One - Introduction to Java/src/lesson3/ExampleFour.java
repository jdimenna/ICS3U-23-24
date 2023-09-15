package lesson3;

public class ExampleFour {
    public static void main(String[] args) {
        int num = 673;
        int digits = num%10; // divide by 10 and get the remainder, ALWAYS gets the one digit, in this case 3 of 673
        int digits3 = num/100; // there are 6 100s, gets the hundrets digit 
        int digits2 = num%100 / 10;  // gets 73, thend divides it to get 7
        int sum = digits + digits2 + digits3;
        System.out.println(sum);
    }
}
