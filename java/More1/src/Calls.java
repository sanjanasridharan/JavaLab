import java.util.*;
import java.util.Calendar;
import java.util.Scanner;
public class Calls {
	
	
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		  String name,time;long phone;
		  Calendar c=Calendar.getInstance();
		  HashMap<Long,String> hm=new HashMap<Long,String>();
		  System.out.println("enter the no of contacts: ");
		  int n=sc.nextInt();
		  for(int i=0;i<n;i++)
		  {
			  System.out.println("enter name: ");
			  name=sc.next();
			  System.out.println("Enter number: ");
			  phone=sc.nextLong();
			  hm.put(phone, name);
		  }
		  ArrayList<Demo> missedcalls=new ArrayList<Demo>();
		  int ch=0;int h,m,s;int i=0;
		  while(ch!=2)
		  {
			  System.out.println("1.Enter missed calls\n2.exit");
			  ch=sc.nextInt();
			  switch(ch)
			  {
			  case 1:
				       System.out.println("Enter no: ");
				       phone=sc.nextLong();
				       if(hm.containsKey(phone))
				    	   name=hm.get(phone);
				       else 
				    	   name="private caller";
				       h=c.get(Calendar.HOUR);
				       m=c.get(Calendar.MINUTE);
				       time=h+":"+m;
				       Demo d=new Demo(name,phone,time);
				       try
				       {
				    	   missedcalls.set(i, d);
				       }
				       catch(Exception e)
				       {
				    	   missedcalls.add(d);
				       }
				       finally
				       {
				    	   i=(i+1)%10;
				       }
				       break;
			  case 2:break;
				       
				       
			  }
		  }
		  
		  
		  for(Iterator<Demo> it=missedcalls.iterator();it.hasNext(); )
		  {
			  Demo d1=it.next();
			  System.out.println(d1.phone);
			  int rh;
			  System.out.println("1.Print Details\n2.Delete\n3.Next No.\n");
			  rh=sc.nextInt();
			  switch(rh)
			  {
			  case 1:d1.display();
			         break;
			  case 2:it.remove();
			           System.out.println("Removed");
			  case 3:break;
			  }
			  
			  
			  
			  
			  
			  
			  
		  }
		  
	}
}
