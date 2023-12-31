import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
        double t = Double.parseDouble(args[0]);
        int x;
        int seed=Integer.parseInt(args[1]);
        Random generator = new Random(seed);
        int sum;
        double total=0.0;
        int two=0;
        int three=0;
        int four=0;
        boolean y;
        String a;
        for(int i=0;i<=t;i++)
        {
            x= generator.nextInt();
            sum=1;
            y = false;
            a="";
            if(x<5)
            {
                a="g ";
                while (y==false) 
                {
                    x=generator.nextInt();
                    if(x<5)
                        {
                            a+= "g ";
                            sum++;
                        }
                    else
                        {
                            a+= "b ";
                            y=true;
                            sum++;
                        }
                
                }
            }
            else
            {
                a="b ";
                while (y==false) 
                    {
                        x=generator.nextInt();
                        if(x<5)
                            {
                                a+= "g ";
                                y=true;
                                sum++;
                            }
                        else
                            {
                                a+= "b ";
                                sum++;
                            }
                    }
            }
            total+=sum;
            if(sum==2)
            {
                two++;
            }
            else if(sum==3)
            {
                three++;
            }
            else four++;
        }   
        System.out.println("Average: "+(total/t)+" children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: "+two);
        System.out.println("Number of families with 3 children: "+three);
        System.out.println("Number of families with 4 or more children: "+four);
        if ((two>three)&&(two>four))
        {
            System.out.println("The most common number of children is: 2");
        }
        else if(three>four)
        {
            System.out.println("The most common number of children is: 3");
        }
        else System.out.println("The most common number of children is: 4"); 
		    
	}
}
