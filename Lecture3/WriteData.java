
/**
 * Demonstrates how to read data from a text file.
 * @author https://liveexample.pearsoncmg.com/html/WriteData.html
 *
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
	public static void main(String[] args) {

		PrintWriter output = null;
		try {
			output = new PrintWriter(new File("addresses.txt"));
			// Write formatted output to the file
			output.print("Alexandra Papoutsaki ");
			output.println(222);
			output.print("Jingyi Li ");
			output.println(111);

		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			if (output != null)
				output.close();
		}
	}
}