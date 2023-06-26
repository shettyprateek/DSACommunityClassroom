import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int previous = 0;
        int end = 1;
        int count = 2;
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(previous);
        System.out.println(end);

        while(count < n){
            int temp = end;
            end = previous + end;
            previous = temp;
            count++;
            System.out.println(end);
        }

    }
}
