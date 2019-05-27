import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.Scanner;
import java.util.Iterator;
public class MainClass {

	
	 public static void main(String[] args)
	 {
		 
		   ArrayList<Books> al = new ArrayList<Books>();
		   al.add(new Books("men","khalead","bloomsbery",50));
		   al.add(new Books("kite runner","khalead","bloomsbery",500));
		   al.add(new Books("trans","khalead","bloomsbery",1000));
		   al.add(new Books("mountains","khalead","bloomsbery",200));
		   al.add(new Books("women","khalead","bloomsbery",100));
		   
		   System.out.println("Before sorting:");
		   for(Iterator<Books> it=al.iterator();it.hasNext();)
		   {
			   it.next().display();
		   }
		   System.out.println("After sorting:");
		   ArrayList<Books> al1=new ArrayList<Books>();
		   al1.addAll(al);
		   Collections.sort(al1,new Sort());
		   for(Iterator<Books> it=al1.iterator();it.hasNext();)
		   {
			   it.next().display();
		   }
		   
		   
	 }
}
