
public class Books  {
	
	String author,title,publisher;int price;
	public Books(String t,String a,String p,int pr)
	{
	
		title=t;
		author=a;
		publisher=p;
		price=pr;
	}
	public void display()
	{
		System.out.println("Title: "+title+"\nAuthor: "+author+"\npublisher: "+publisher+"\nprice: "+price);
		
	}

}
