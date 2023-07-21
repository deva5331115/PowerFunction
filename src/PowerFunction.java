import java.util.Scanner;

public class PowerFunction {
     static int power(int num, int pow, int mod){
        if(pow == 1){
            return num % mod;
        }
        return power(num, pow - 1, mod) * num % mod;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        int pow= scan.nextInt();
        int modulus=scan.nextInt();
        System.out.println(power(num, pow , modulus));
    }
}
