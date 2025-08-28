package P5_itp;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String msg = input.nextLine();

        System.out.print("Enter the substring to replace: ");
        String replace = input.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacement = input.nextLine();

        String msg2 = msg.replace(replace, replacement);

        System.out.print("The updated message is: "+msg2);



        
    }
}
