class House
{  
	int pillar_length = 6;
	int beam_length = 3;
	void mass()
	{
	  System.out.println("construct a building");
	}
}
class Test_1
{
	public static void main(String[] arg)
	{
		House b1=new House();
		House b2=new House();
		b1.mass();
		b2.mass();
		System.out.println(b1.pillar_length + "ft");
		System.out.println(b2.beam_length + "ft");
	}
}	