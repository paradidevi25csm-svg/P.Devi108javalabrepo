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
class Inh3
{
	public static void main(String[] arg)
	{
		A a = new A();
		System.out.println(a.i);
		System.out.println(a.j);
		a.m();
	}
}