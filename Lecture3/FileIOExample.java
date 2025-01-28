import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIOExample {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the input file name: ");
        String inputFile = inputScanner.nextLine();
        System.out.println("Enter the number of lines to read: ");
        String linesInput = inputScanner.nextLine();
        int numberOfLines = -1;
        try {
            numberOfLines = Integer.parseInt(linesInput);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input for number of lines");
        }
        finally{
            inputScanner.close();
        }
        Scanner fileScanner = null;
        PrintWriter writer = null;
        try {
            fileScanner = new Scanner(new File(inputFile));
            writer = new PrintWriter("output.txt");

            int linesRead = 0;
            while (fileScanner.hasNextLine() && linesRead < numberOfLines) {
                String line = fileScanner.nextLine();
                System.out.println(line);
                writer.println(line);
                linesRead++;
            }
        } catch (IOException e) {
            System.err.println("Error reading or writing files: " + e.getMessage());
        }
        finally{
            if(fileScanner!=null){
                fileScanner.close();
            }
            if(writer!=null){
                writer.close();
            }
        }
    }
}