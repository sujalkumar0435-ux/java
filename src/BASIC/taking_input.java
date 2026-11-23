package BASIC;

import java.util.Scanner;

public class taking_input {
    static void main() {
        System.out.print("enter radius of a circle :");

        Scanner sc= new Scanner(System.in);
        double r = sc.nextDouble();

        double result = 3.17*r*r;
        System.out.println( "area of circle :"+ result);
    }
}
