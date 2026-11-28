package if_else;

import java.util.Scanner;

public class absolute_value {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n<0 )
            System.out.println(-n);
        else System.out.println(n);
    }
}
