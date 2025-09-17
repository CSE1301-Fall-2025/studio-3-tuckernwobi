import java.util.Scanner;
public class Sieve {

    public static void main(String[] args){
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Search for prime numbers up to what number: ");
        int n = scanInput.nextInt();
        boolean[] number = boolean boolean[n+1];
        for(int i = 2; i < n+1; i++) {
            number[i] = true;
            System.out.println(number[i]);
        }
    }


}