package kethua;

public class kethuadongian1 extends kethuadongian{
private float bonus;
	public float getBonus() {
		return bonus;
	} 
public void setBonus(float bonus) {
	this.bonus=bonus;
}
public kethuadongian1 (float Salary, float bonus) {
	super (Salary);
	this.bonus=bonus;
}
}
