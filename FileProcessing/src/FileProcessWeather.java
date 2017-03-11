import java.io.*;
import java.util.*;

public class FileProcessWeather {
	public static void main (String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("./resources/weather"));
		double currentTemp = input.nextDouble(); //the next input
		
		while(input.hasNextDouble()) { //checks if next input is a double
			double nextTemp = input.nextDouble();
			double change = nextTemp - currentTemp;
			System.out.println(currentTemp + " to "  + nextTemp + ", change = " + change);
			currentTemp = nextTemp; 
		}
	}
}x