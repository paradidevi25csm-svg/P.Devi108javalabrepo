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
	int m(int k,int l,int i)
	{
		System.out.println(k+l+i);
		return 0;
    }
}
class Overl2
{
	public static void main(String[] args)
	{
		A a = new A();
		a.m(10,20);
		a.m(10.5f,20.6f);
		a.m(10,20,30);
	}
}