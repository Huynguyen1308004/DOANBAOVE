package doanhoanchinh;
import java.util.Scanner;
import Doan.quanlisinhvien;
import Doan.cacMenu;
public class Main {
	QuanLyHocPhan obj=new QuanLyHocPhan();
	quanlisinhvien svobj=new quanlisinhvien();
	cacMenu menu=new cacMenu();
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		cacMenu menu= new cacMenu();
		Scanner sc=new Scanner(System.in);
		int chon;
		do {
			System.out.println("1. Lam viec voi sinh vien:");
			System.out.println("2. Lam viec voi hoc phan:");
			System.out.println("3. Lam viec voi giang vien:");
			System.out.println("Moi ban chon:");
			chon=sc.nextInt();
			switch(chon)
			{case 1: {menu.menuSv();break;}
			case 2: {menu.menuHp();break;}
			
			default: break;
			}
		}while(chon<=3);
	}
}
