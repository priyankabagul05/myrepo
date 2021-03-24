abstract class abc1
{
	abstract void m1();
	void m2()
	{
	System.out.println("parent");
	}
}
class child extends abc1
{
	void m1()
	{
	System.out.println("child");
	}
}
class abstracttest
{
	public static void main(String args[])
	{
	child obj=new child();
	obj.m1();
	obj.m2();
	}
}