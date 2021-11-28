import java.util.Scanner;
public class clloop {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int reverse = 0;
        while(num>0){
            int rem = num % 10;
            reverse = reverse* 10+rem;
            num /=10;

        }
        System.out.println("reverse :" +reverse);
        // int counter = 1;

        // while counter <=5;
        //    System.out.printIn("hello world");
           //counter++;
    }

}
