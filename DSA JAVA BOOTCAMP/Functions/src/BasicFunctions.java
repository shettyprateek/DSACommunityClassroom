import java.util.Scanner;

public class BasicFunctions {

    public static void main(String[] args) {
        System.out.println(greetings("Prateek Shetty"));
        System.out.println(squareOfNo());
    }

    static String greetings(String name){
        String greeting = "Hello "+ name;
        return greeting;
    }

    static int squareOfNo(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int square = num*num;
        return square;
    }
}