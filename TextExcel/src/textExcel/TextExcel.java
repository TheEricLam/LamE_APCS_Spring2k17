package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
	    Spreadsheet spreadsheetExcel = new Spreadsheet(); //creates new spreadsheet
	    String input = console.nextLine();
	    	
	    while(!(input.equals("quit"))){  // loop until user types quit
			String answer = spreadsheetExcel.processCommand(input);
			System.out.println(answer);
			input = console.nextLine();
		}
	}
}