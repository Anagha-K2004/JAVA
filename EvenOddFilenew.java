import java.io.*;
import java.util.*;

public class EvenOddFilenew {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Step 1: Write input to file
            FileWriter inputWriter = new FileWriter("input.txt");

            System.out.print("Enter how many numbers: ");
            int n = sc.nextInt();

            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                inputWriter.write(num + " ");
            }
            inputWriter.close();

            // Step 2: Read from input file
            Scanner fileReader = new Scanner(new File("input.txt"));

            FileWriter evenWriter = new FileWriter("even.txt");
            FileWriter oddWriter = new FileWriter("odd.txt");

            // Step 3: Separate even and odd (NO hasNext)
            while (true) {
                try {
                    int num = fileReader.nextInt();

                    if (num % 2 == 0) {
                        evenWriter.write(num + " ");
                    } else {
                        oddWriter.write(num + " ");
                    }
                } catch (NoSuchElementException e) {
                    break; // end of file
                }
            }

            fileReader.close();
            evenWriter.close();
            oddWriter.close();

            // Step 4: Display all files (NO hasNext)

            // input.txt
            System.out.println("\nContents of input.txt:");
            Scanner inputReader = new Scanner(new File("input.txt"));
            while (true) {
                try {
                    System.out.print(inputReader.nextInt() + " ");
                } catch (NoSuchElementException e) {
                    break;
                }
            }
            inputReader.close();

            // even.txt
            System.out.println("\nContents of even.txt:");
            Scanner evenReader = new Scanner(new File("even.txt"));
            while (true) {
                try {
                    System.out.print(evenReader.nextInt() + " ");
                } catch (NoSuchElementException e) {
                    break;
                }
            }
            evenReader.close();

            // odd.txt
            System.out.println("\nContents of odd.txt:");
            Scanner oddReader = new Scanner(new File("odd.txt"));
            while (true) {
                try {
                    System.out.print(oddReader.nextInt() + " ");
                } catch (NoSuchElementException e) {
                    break;
                }
            }
            oddReader.close();

            sc.close();

            System.out.println("\n\nProcess completed!");

        } catch (IOException e) {
            System.out.println("Error handling file!");
        }
    }
}
