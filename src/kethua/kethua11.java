package kethua;

public class kethua11 extends kethua1 {
private static float bonus;
	public static float getBonus() {
	return bonus;
}
public static void setBonus(float bonus) {
	kethua11.bonus = bonus;
}
	public kethua11(float Salary, float bonus) {
		super(Salary);
		this.bonus=bonus;
	}
	public static float ThucNhan()
	{
		return getSalary()+ getBonus();
	}
	}


