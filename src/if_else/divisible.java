package if_else;

import java.util.Scanner;

public class divisible {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if((n%3==0 )||( n%5==0)){
            System.out.println(n + " is divisible by 3 or 5");
        }
    }
}
