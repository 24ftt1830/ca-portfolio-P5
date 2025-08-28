package P5_itp;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String Firstword = input.nextLine();

        System.out.print("Enter the second word: ");
        String Secondword = input.nextLine();

        String ngam = "true";
        String salah = "false";

        if (Firstword.equalsIgnoreCase(Secondword)) {


            System.out.print("Are both words the same? " +ngam);
            
        }
        else {
            System.out.print("Are both words the same? " +salah);
        }




    }
    
}
