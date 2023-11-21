package lop;

public class napchong {

	static  int add(int a, int b)
	{
		return(a+b);
	}
static int add(int a, int b, int c) {
	return (a+b+c);
}
static double add(double a, double b) {
	return(a+b);
}

public static void main (String[] args) {
napchong lan1= new napchong();
napchong lan2= new napchong();
napchong lan3= new napchong();
System.out.println(lan1.add (6, 7));
System.out.println(lan2.add (6, 7, 8));  
// System.out.println(lan3.add(7.6 , 6.5)
}
}