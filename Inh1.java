class A
{
	int i=10;
	int j=20;
	void m1()
	{
		System.out.println("scm");
	}
}
class B extends A
{
	int k=30;
	void m2()
	{
		System.out.println("ccm");
	}
}
class Inh
{
	public static void main(String[] arg)
	{
		A a = new A();
		a.m1();
		System.out.println(a.i);
		System.out.println(a.j);
	
	}
}