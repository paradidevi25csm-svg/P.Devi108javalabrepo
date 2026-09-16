class A 
{
	int i;
	int j;
	int k;
	A(int i)
	{
		this.i=i;
	}
	A(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	A(int i,int j,int k)
	{
		this.i=i;
		this.j=j;
		this.k=k;
	}
	void m()
	{
		System.out.println(i+j+k);
    }
}
class Con_OL
{
	public static void main(String[] arg)
	{
		//A a=new A(10);
	//	A a=new A(10,20);
		A a=new A(50,60,70);
		a.m();
		
	}
}
