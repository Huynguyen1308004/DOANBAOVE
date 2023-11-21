package lop;

import java.util.*;
public class ArrayListStudent {
	
	public static ArrayList<student> studentList=new ArrayList<student>();
	
	public static void nhap() {
		int i;
		Scanner sc=new Scanner(System.in);
		for (i=0; i<3; i++)
		{
			System.out.print("Nhập id: ");
			int id=sc.nextInt();
			System.out.print("Nhập họ tên: ");
			String t=sc.nextLine();
			String ht=sc.nextLine();
			System.out.print("Nhập GPA: ");
			float gpa=sc.nextFloat();
			student tam=new student(id,ht,gpa);
			studentList.add(tam);
		}
		}
		public static void xoa(String ht)
		{
			for(int i=0;i<studentList.size();i++)
			{
			if(studentList.get(i).getName().equals(ht)==true)
				studentList.remove(i);
	}
	}
		public static void sort()
		{
			Collections.sort(studentList,new Comparator<student>()
			{
				@Override
				public int compare(student sv1, student sv2)
				{
					if (sv1.getGpa() < sv2.getGpa())return -1;
					else if (sv1.getGpa()== sv2.getGpa()) return 0;
						else return 1;
					}
				});
		}
	public static void hienthi() {
		int i;
		for(i=0; i< studentList.size(); i++)
		{
			System.out.println(studentList.get(i).getId()+" "+ studentList.get(i).getName()+" "+ studentList.get(i).getGpa());
		}
}
	public static void kq() {
		for(student st: studentList)
			if(st.getGpa()>=5) st.setKq("dau");
			else st.setKq("rot");
	}
	public static void xl() {
		for(int i=0;i<studentList.size();i++) {
			if (studentList.get(i).getGpa()<5) studentList.get(i).setXl("Kem");
			else if(studentList.get(i).getGpa()<7) studentList.get(i).setXl("Tb");
			else if (studentList.get(i).getGpa()<8) studentList.get(i).setXl("Kha");
			else studentList.get(i).setXl("Gioi");
		}
	}
	public static void chen()
	{
		System.out.println("Nhap gia tri can chen");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		float gpa=sc.nextFloat();
		student tam=new student(id,name,gpa);
		System.out.println("Nhap vi tri can chen:");
		int vt=sc.nextInt();
		studentList.add(vt,tam);
	}
	public static void sua(int id, String name, float gpa)
	{
		for(int i=0;i<studentList.size();i++)
		{
			if(studentList.get(i).getId()==id) 
			{
				studentList.get(i).setName(name);
				studentList.get(i).setGpa(gpa);
			}
		}
	}
	public static void hienthi1()
	{
		for (student st: studentList)
		{
			System.out.println(st.getId()+" "+st.getName()+" "+st.getGpa()+" ");
		}
}
	public static void hienthiif()
	{
		for (student st: studentList)
		{
			if( st.getGpa()>=5) System.out.println(st.getId()+" "+st.getName()+" "+st.getGpa()+" ");
		}
	}
	public static float ln() {
		float max=studentList.get(0).getGpa();
		for(student st: studentList) {
			if (max<st.getGpa()) max=st.getGpa();
		}
		return max;
	}
}