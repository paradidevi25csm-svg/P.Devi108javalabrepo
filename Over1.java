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
class Over1
{
	public static void main(String[] arg)
	{
	  A a = new B();
	   a.m();
	}
}