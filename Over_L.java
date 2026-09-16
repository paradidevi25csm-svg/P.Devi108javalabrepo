class A
{
	int m(int k,int l)
	{
		System.out.println(k+l);
		return 0;
	}
	float m(float m,float n)
	{
		System.out.println(m+n);
			return 0;
	}
}
class Over_L
{
	public static void main(String[] arg)
	{
		A a = new A();
		a.m(10,20);
		a.m(10.5f,20.6f);
	}
}
		