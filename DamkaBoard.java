/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
	int n = Integer.parseInt(args[0]);
        int x = n;
        while (x>1) 
        {
            for(int i=0; i<n; i++)
            {
            System.out.print("* ");
            }
            System.out.println();
            for(int j=0; j<n; j++)
            {
            System.out.print(" *");
            }
            System.out.println();
            x-=2;
        }
        if ((n%2)!=0)
        {
            for(int k=0; k<n; k++)
            {
            System.out.print("* ");
            }
        }
	}
}
