package P5_itp;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class P5 {
    public static void main(String[] args) throws IOException  {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine()  ;

        String nameBasar =name.toUpperCase();


        String filename = "C:/Practical 5/QReceipt.txt";
        FileWriter fw = new FileWriter(filename);

        LocalDateTime ldt = LocalDateTime.now();

        DateTimeFormatter dtf = 
        DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formmatedLDT = ldt.format(dtf);
        
        
        int limit = 100;
        limit = limit + 1;  
        // // +1 for getting limit to 100
        int randomLimit = (int) (Math.random()*limit);

        fw.write(formmatedLDT);

        fw.write("\r\nHi "+ nameBasar);

        fw.write("\r\nYour Queue No is : "+randomLimit);




       fw.close();

       System.out.print("Receipt generated. Thank You");

    }
}
