class A
{
	int i=10;
	int j=20;
	void m()
	{
		System.out.println("hi");
	}
}
class B extends A 
{
	void m()
	{
		System.out.println("hello");
	}
}
class Over
{
	public static void main(String[] arg)
	{
	   B b = new B();
	   b.m();
	}
}