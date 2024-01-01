
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
	int x=(int)(Math.random()*10);
        int sum=1;
        boolean y = false;
        String a="";
        if(x<5)
        {
            a="g ";
            while (y==false) 
            {
                x=(int)(Math.random()*10);
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
                    x=(int)(Math.random()*10);
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
        System.out.println(a);
        System.out.println("You made it... and you now have "+sum+" children");
	}
}
