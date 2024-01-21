import java.util.Scanner;
import java.util.Random;
public class guessTheNUmber{
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(100);
        Scanner s = new Scanner(System.in);
        //System.out.println(r);
        System.out.print("enter your number between 0 to 100:");
        int a = s.nextInt();
        if (a < r) {
            System.out.println("your number is lower than this number.");
        } else if (a > r) {
            System.out.println("your number is higher than this number.");
        } else if (a == r) {
            System.out.println("you guess right number");
        } else {
            System.out.println("please,enter valid number");
        }
        int i=1;
        while (a != r) {

            i++;
            System.out.print("enter your number between 0 to 100:");
            int b = s.nextInt();

            if (b < r) {
                System.out.println("your number is lower than this number.");
            } else if (b > r) {
                System.out.println("your number is higher than this number.");
            } else if (b == r) {
                System.out.println("you guess right number");
                break;
            } else {
                System.out.println("please,enter valid number");
            }
        }
        System.out.println("you won");
        System.out.println("number of try:"+i);
    }
}
