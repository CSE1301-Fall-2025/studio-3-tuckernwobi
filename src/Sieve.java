import java.util.Scanner;
public class Sieve {

    public static void main(String[] args){
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Search for prime numbers up to what number: ");
        int n = scanInput.nextInt();
        boolean[] number = new boolean[n+1];
        for(int i = 2; i <= n; i++) {
            number[i] = true;
        }
        for(int i = 0; i<=n; i++){
            if (number[i] == true){
                for(int j = i + i; j <= n; j=j+i){
                    number[j] = false;
                } 
            }
        }
        System.out.println("These are the prime numebrs until " + n + ": ");
        for(int i = 0; i<=n; i++) {
            if (number[i] == true){
                System.out.print(" " + i);
            }
        }


    }


}