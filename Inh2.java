class A
{
	int i=10;
	int j=20;
	void m()
	{
		System.out.println(i+j);
	}
}
class B extends A
{
	void m1()
	{
		System.out.println(i+j);
	}
}
class Inh2
{
	public static void main(String[] arg)
	{
		B b = new B();
		b.m();
		b.m1();
		System.out.println(b.i);
		System.out.println(b.j);
	}
}