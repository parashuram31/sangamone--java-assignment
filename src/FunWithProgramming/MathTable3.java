package FunWithProgramming;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MathTable3 {
    public static void main(String[] args) {
        String fileName = "in.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int firstNumber = 0;
            int secondNumber = 0;

            
            for (int i = 0; i < 2; i++) {
                line = reader.readLine();

                if (line == null) {
                    System.out.println("Insufficient input.");
                    return;
                }

                if (i == 0)
                    firstNumber = Integer.parseInt(line);
                else if (i == 1)
                    secondNumber = Integer.parseInt(line);
            }

            
            for (int i = firstNumber; i <= secondNumber; i++) {
                System.out.println("Multiplication table for " + i + ":");
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Can't able to read " + fileName);
        }
    }
}
