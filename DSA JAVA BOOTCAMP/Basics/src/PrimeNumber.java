import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean flag = false;

        for (int i = 2; i <=number/2; i++) {
            if(number%i==0){
                flag = true;
            }
        }
        if(flag){
            System.out.println(number + " is not a prime Number");
        }
        else{
            System.out.println(number + " is a prime Number");
        }
    }
}
