package P5_itp;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 5 letters word: ");
        String limahuruf = input.nextLine();

    if (limahuruf.length() <= 5) {
            
        System.out.print("The reverse of the word "+limahuruf+" is " 
        +limahuruf.charAt(4)
        +limahuruf.charAt(3)
        +limahuruf.charAt(2)
        +limahuruf.charAt(1)
        +limahuruf.charAt(0));

    } 
    else if (limahuruf.length() >= 4) {
        System.out.print("Please enter ONLY 5 letter words!");
    }
}}
