package DOANBAOVE;
import java.util.Scanner;
public class Main {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu=new Menu();
		Scanner sc=new Scanner(System.in);
		int chon;
		do {
			System.out.println("|*********LAM VIEC***************|");
			System.out.println("|********1.Sinh Vien*************|");
			System.out.println("|********2.Hoc Phan**************|");
			System.out.println("|********3.Giang Vien************|");
			System.out.println("|*********Moi Ban Chon***********|");
			chon=sc.nextInt();
			switch(chon)
			{
			case 1: {menu.menuSv();break;}
			case 2: {menu.menuHp();break;}
			case 3: {menu.menuGv();break;}
			
			default : break;
			}
		}while(chon<=3);
	}
}

