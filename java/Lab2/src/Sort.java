import java.util.*;
public class Sort implements Comparator<Books> {
	String a,b;
	public int compare(Books a,Books  b)
	{
		return a.title.compareTo(b.title);
	}

	
}
