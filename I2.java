interface I
{
	void m1();
	void m3();
	int a=10;
}
interface I1
{
	void m4();
}
class A
{
	void m()
	{
		System.out.println("roja");
	}
}
abstract class B extends A implements I,I1
{
	public void m1()
	{
		System.out.println("sai");
	}
}
abstract class C extends B 
{
	public void m3()
	{
		System.out.println("raju");
	}
}
class D extends C
{
	public void m4()
	{
		System.out.println("hello");
	}
}
class If
{
	public static void main(String[] args)
	{
	    D d = new D();
		d.m1();
		d.m3();
		d.m4();
	}
}