class A
{
	private int a;
	private int b;
	void setValuea(int a)
	{
		this.a=a;
    }
	int getValuea()
	{
		return a;
	}
	void setValueb(int b)
	{
		this.b=b;
	}
	int getValueb()
	{
		return b;
    }
}
class Sg
{
	public static void main(String[] args)
	{
		A a1 =new A();
		a1.setValuea(10);
		System.out.println(a1.getValuea());
		a1.getValueb(20);
		System.out.println(a1.getValueb());
	}
}
	