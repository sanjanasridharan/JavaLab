import java.util.*;
public class Demo {
	String name,time;long phone;
	public Demo(String n,long p,String t)
	{
		name=n;
		phone=p;
		time=t;
	}
	
	public void display()
	{
		System.out.println("Name: "+name+"\ntime: "+time+"\nPhone no: "+phone);
	}

}
