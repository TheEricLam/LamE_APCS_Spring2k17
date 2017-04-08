
import java.util.*;
/* -----------
 * Eric Lam
 * 2nd Period
 * 3/23/17
 * -----------
 * Method changePi takes in a string parameter
 * If the keyword "pi" is in the String then 
 * it changes it to 3.14
 * Ex. input = xpix, output = x3.14x
 */

public class RecursionPrac {
	public static void main(String[] args){
		
		Scanner sentence = new Scanner(System.in);
		System.out.println("Please enter your string sentence:");
		String sentence1 = sentence.next();
		sentence1 = sentence1.replaceAll("[^A-Z]","");
		
		
		
		
		String test = changePi(sentence1);
		System.out.println(test);
		
	}
	public static String changePi(String str){
		if(str.length() <= 2){	                           //base case
			if(str.equals("pi"))
				return "3.14";
			else
				return str;
		}else if(str.substring(0, 2).equals("pi")){        
			return("3.14" + changePi(str.substring(2)));   //recursion case
		}else{
			return (str.charAt(0) + changePi(str.substring(1)));
		}
	}
}
