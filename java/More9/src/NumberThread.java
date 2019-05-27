import java.util.*;
public class NumberThread  extends Thread
{
    HashMap<Integer,String> hm=new HashMap<Integer,String>();
    public NumberThread()
    {
    	hm.put(0, "zero");
    	hm.put(1, "one");
    	hm.put(2, "two");
    	hm.put(3, "three");
    	hm.put(4, "four");
    	hm.put(5, "five");
    	hm.put(6, "six");
    	hm.put(7, "seven");
    	hm.put(8, "eight");
    	hm.put(9, "nine");
    }
    public void run()
    {System.out.println("enter a four digit number");
      Scanner sc=new Scanner(System.in);
      String no=sc.next();
      for(int i=0;i<no.length();i++)
      {
    	  int j=Integer.parseInt(""+no.charAt(i));
    	  System.out.println("digit: "+j+" word: "+hm.get(j));
      }
    	
    }
}
