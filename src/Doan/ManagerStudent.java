package Doan;
import java.util.ArrayList;
public class ManagerStudent {
	public ArrayList<Student> StudentList=new ArrayList<Student>();
	public void docfile()
	{
		StudentDown obj=new StudentDown();
		StudentList= obj.docDiemThi("d:\\thi1.bin");
		for(Student st: StudentList)
		{
			System.out.println("Ho Ten la:"+st.getHoTen()+" diem tb la:" +st.getDiemTrungBinh());
		}
	}
	public void hienthi()
	{
		for(Student st: StudentList)
		{
			System.out.println("Ho ten La" +st.getHoTen()+"diem tb la:"+ st.getDiemTrungBinh());
		}
	}
	public void hienthisvlonhon5()
	{
		for(Student st: StudentList)
		{
			if ( st.getDiemTrungBinh()>5) {
				System.out.println("Ho ten la:"+st.getHoTen()+"diem tb la:"+st.getDiemTrungBinh());
			}
			
		}
	}
	public float ln()
	{
		float max =0;
		for(Student st:StudentList)
		{
			if(max<st.getDiemTrungBinh())max=st.getDiemTrungBinh();
			
		}
		return max;
	}
	public void dauvarot() {
	
	{
		for(Student st:StudentList)
		if(st.getDiemTrungBinh()>5) {
			System.out.println(st.getHoTen()+":đậu");
		}
		else {
			System.out.println(st.getHoTen()+":rớt");
		}
	}
	}
		public void chen(Student obj, int vt)
		{
			StudentList.add(vt, obj);
		}
		public void xoa(String ht)
		{
			for(int i=0; i< StudentList.size();i++)
			{if(StudentList.get(i).getHoTen().equals(ht)==true)
				StudentList.remove(i);
			}
		}
	}
	

