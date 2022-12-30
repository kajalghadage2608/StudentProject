package com.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarMainTest {

	public static void main(String[] args) {

		List<Car> ls = new ArrayList<Car>();

		Car car = (new Car("BMW", "WHITE", 300000));
		Car car1 = (new Car("NYANO", "RED", 600000));
		Car car2 = (new Car("BULARO", "BLACK", 90000));
		Car car3 = (new Car("HUNDAI", "YELLOW", 4500000));

		ls.add(car);
		ls.add(car1);
		ls.add(car2);
		ls.add(car3);

		System.out.println(ls);

		Predicate<Car> p = x -> x.getCarName().contains("n"); // Lambda fun used

		for (Car car4 : ls) {

			if (p.test(car4)) {

				System.out.println(car.getCarName());

			}
		}

	}

}
