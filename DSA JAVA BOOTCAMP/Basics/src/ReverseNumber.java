import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int output = 0;

        while(number > 0){
            int temp = number % 10;
            output = (output*10) + temp;
            number /=10;
        }
        System.out.println(output);
    }
}
