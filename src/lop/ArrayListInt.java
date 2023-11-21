package lop;
import java.util.*;
public class ArrayListInt {

	public static ArrayList<Integer> list =new ArrayList();
		// TODO Auto-generated method stub
public static void input()
{
	Scanner sc= new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
		System.out.println("Input list: ");
		int n=sc.nextInt();
		list.add(n);
	}
}
public static void display()
{
	for (int i=0; i<list.size();i++)
	{
		System.out.println(list.get(i));
	}
}

public static void displayIf()
{
	for (int i=0; i<list.size(); i++)
	{
		if(list.get(i)>=5) System.out.println(list.get(i)+";");
	}
}
public static void delete(int number)
{
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).equals(number))
			list.remove(i);
	}
	}
	public static int ln()
	{
		int max=list.get(0);
		for (int i=0;i<list.size();i++)
		{
			if(max<list.get(i)) max=list.get(i);
		}
		return max;
	}
	public static void sort()
	{
		list.sort(Comparator.naturalOrder());
		//list.sort(Comparator.reverseOrder());
}
}



