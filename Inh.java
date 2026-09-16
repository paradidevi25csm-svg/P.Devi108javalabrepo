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
		B b = new B();
		b.m1();
		b.m2();
		System.out.println(b.i);
		System.out.println(b.j);
		System.out.println(b.k);
	}
}
	