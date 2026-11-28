package if_else;

import java.util.Scanner;

public class check_iinteger {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double d= sc.nextDouble();
        int d2= (int) d;

        if (d-d2==0){
            System.out.println(d +" is an integer");
        }
        else System.out.println(d + " is not an integer");
    }
}
