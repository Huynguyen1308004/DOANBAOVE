package lop;

public class bai1 {
	private int id;
	private String name;
public void input(int id, String name) 
{
	this.id=id;
	this.name=name;
}
public void display() 
{
	System.out.println(id+"   "+name);
}
public int getId() 
{
	return id;
}
public void setId(int id) 
{
	this.id = id;
}
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public bai1() {
	super();
}
public bai1(int id, String name)
{
	this.id=id;
	this.name=name;
}
}


