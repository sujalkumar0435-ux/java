package if_else;

import java.util.Scanner;

public class checkoddeven {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
//        if (a% 2== 0){
//            System.out.println("even");
//        }
//        else System.out.println("odd");



        if (a%5==0){
            System.out.println(a + " is divisible by 5");
        }
        else System.out.println(a + " is not divisible by 5");

    }
}
