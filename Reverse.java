/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
	String word = args[0]; 
        int counter = word.length()-1;
        while (counter>=0) 
        {
            System.out.print(word.charAt(counter));
            counter = counter-1;
        }
        System.out.println();
        System.out.println("The middle character is "+word.charAt(word.length()/2));
	}
}
