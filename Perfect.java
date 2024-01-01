/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
	int x = Integer.parseInt(args[0]);
        int counter = 2;
        int sum =1;
        String a = "1 ";
        while(counter<=x)
        {
            if(x%counter==0)
            {
            if((counter)==x)
            {
                a+=" = "+x;
            }
            else 
            {
                sum+=counter;
                a =a+"+ "+counter+" ";
            }
            }
            counter +=1;
        }
        if (sum==x)  
        {
            System.out.println(x+" is a perfect number since "+a);
        }
        else System.out.println(x+" is not a perfect number");
	}
}
