import java.util.*;
public class VowelThread extends Thread {
	
	ArrayList<Character> al=new ArrayList<Character>();
	public VowelThread()
	{
		al.add('a');
		al.add('e');
		al.add('i');
		al.add('o');
		al.add('u');
	}
	public void run()
	{
		int v=0,c=0;
		System.out.println("enter a word: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char a=s.charAt(i);
			if(al.contains(a))
			{
				v++;
			}
			else
				c++;
		}
		System.out.println("vowels: "+v);
		System.out.println("count: "+c);
		
	}

}
