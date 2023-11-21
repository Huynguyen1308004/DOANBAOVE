package mainkethua;

import kethua.kethuadongian1;

public class maindongian {
	public static void main(String[] args) {
		kethuadongian1 p=new kethuadongian1(1000000,5000000);
		System.out.println("Lương là: " +p.getSary());
		System.out.println("Thưởng là: " +p.getBonus());
		System.out.println("thuc nhan la: " +p.getSary() +p.getBonus());
	}
}