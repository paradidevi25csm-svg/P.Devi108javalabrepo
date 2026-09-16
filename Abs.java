abstract class Vehicle 
{
	int speed=100;
	abstract void fuelType();
	void showspeed()
	{
		System.out.println("speed: "+speed);
	}
}
class Car extends Vehicle
{
	@Override
	 void fuelType()
	{
		System.out.println("petrol/diesel");
	}
}
class ElectricCar extends Vehicle
{
	@Override
	 void fuelType()
	 {
	 System.out.println("electric battery");
	 }
}
class Abs
{
	public static void main(String[] args)
	{
		ElectricCar e = new ElectricCar();
		e.fuelType();
		e.showspeed();
	}
}