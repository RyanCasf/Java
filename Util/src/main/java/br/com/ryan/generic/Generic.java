package br.com.ryan.generic;

import java.util.ArrayList;
import java.util.List;

public class Generic 
{
	static List<Car> cars = new ArrayList<Car>();
	static List cars2 = new ArrayList();
	
	public static void main(String[] args) 
	{
		Car c = fetchCar();
		
		cars.add(c);
		cars2.add(c);
		
		Car oldCar = cars.get(0);
		Car oldCar2 = (Car) cars2.get(0);
		
		System.out.println(cars.toString());
		System.out.println(cars2.toString());
		
		// Orange o =  cars.get(0);		--> ClassCastException
		try
		{
			Orange o2 = (Orange) cars2.get(0);
		}
		catch (ClassCastException e) 
		{
			e.printStackTrace();
		}
		System.out.println(cars2.toString());
	}
	
	private static Car fetchCar()
	{
		Car temp = new Car();
		temp.setChave(0l);
		temp.setModelo("A");
		temp.setDescricao("a");
		temp.setManual(false);
		temp.setExcluido(false);
		return temp;
	}
}