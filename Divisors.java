/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
	int x = Integer.parseInt(args[0]);
        int counter = 1;
        while(counter<=x)
        {
            if(x%counter==0)
            {
                System.out.println(counter);
            }
            counter = counter+1;
        }
	}
}
