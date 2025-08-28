package P5_itp;

import java.io.FileWriter;
import java.util.Scanner;
import java.util.random.RandomGenerator;
import java.io.IOException;

public class P4 {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);

        String filename = "C:/Practical 5/ModulusQuestion.txt";

        FileWriter fw = new FileWriter(filename, true);

        int limit = 100;
        limit = limit + 1;  
        // // +1 for getting limit to 100
        int randomLimit = (int) (Math.random()*limit);
        int randomLimit2 = (int) (Math.random()*limit);
        fw.write(+randomLimit+" % "+randomLimit2+" = ?\r\n");

        System.out.print("A new question added");




        fw.close();

        
    }
}
