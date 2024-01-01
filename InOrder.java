/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
	int x=1;
        int y=0;
        while (x>=y) 
        {
            x = (int)(Math.random()*10);
            if (x>=y)
            {
                System.out.print(x);
            }
            y = (int)(Math.random()*10);
            if (x<=y)
            {
                System.out.print(" "+y+" ");
            }
        }
	}
}
