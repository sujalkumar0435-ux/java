package if_else;

import java.util.Scanner;

public class profit_loss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cp: ");
        int cp= sc.nextInt();
        System.out.println("enter sp:");
        int sp = sc.nextInt();

        int profit = sp-cp;
        int loss = cp- sp;

        if (sp>cp){
            System.out.println("profit :"+ profit);

        }
        else if (cp>sp) {
            System.out.println("loss:" + loss);
        }
        else System.out.println("no loss or profit");
    }
}
