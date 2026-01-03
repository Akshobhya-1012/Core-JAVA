package com.app.test;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size");
		size=sc.nextInt();
		Fruit[] basket = new Fruit[size];
		int ch;
//		System.out.println("Enter the details of Colour,Name, Weight");
//		Fruit f = new Fruit(sc.next(), sc.next(), sc.nextDouble());
//		System.out.println(f.toString());
		System.out.println("Welcome to your Basket");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits.");
		System.out.println("5.Display name,color,weight , taste of all fresh fruits ");
		System.out.println("6.Mark a fruit in a basket , as stale");
		System.out.println("7. Mark all sour fruits stale ");
		System.out.println("8.Invoke fruit specific functionality (pulp / juice / jam)");
		System.out.println("9.Exit");
		int count = 0;
	do {
		System.out.println("Enter the Choice");
		ch = sc.nextInt();
		switch (ch) 
		{
		case 1:
			if(count<size)
			{
			System.out.println("Enter colour,name,weight");
			basket[count] = new Mango(sc.next(), sc.next(), sc.nextDouble());
			count++;
			}
			else
				System.out.println("Basket is full!!");
			break;
		case 2:
			if(count<size)
			{
			System.out.println("Enter colour,name,weight");
			basket[count] = new Orange(sc.next(), sc.next(), sc.nextDouble());
			count++;
			}
			else
				System.out.println("Basket is full!!");
			break;

		case 3:
			if(count<size)
			{
			System.out.println("Enter colour,name,weight");
			basket[count] = new Apple(sc.next(), sc.next(), sc.nextDouble());
			count++;
			}
			else
				System.out.println("Basket is full!!");
			break;

		case 4:
			for (Fruit f : basket) {
				System.out.println(f.getName());
			}
			break;
		case 5:
			for (Fruit f : basket) {
				if (f.isFresh() == true) {
					System.out.println(f.toString() + f.taste());
				}

			}
			break;
		case 6:
			System.out.println("Enter the index");
			int i = sc.nextInt();
			if (i <= count) {
				basket[i].setFresh(false);
			} else
				System.out.println("Invalid Index");
			break;

		case 7:
			for (Fruit f : basket) {
				if (f.taste().equals("sour")) {
					f.setFresh(false);
				}

			}
			break;

		case 8:
			System.out.println("Enter the index to be invoked");
			i = sc.nextInt();
			for (int j = 0; j <= count; j++) {
				if (j == i) {
					if (basket[i] instanceof Mango) {
						((Mango) basket[i]).pulp();
					} else if (basket[i] instanceof Orange) {
						((Orange) basket[i]).juice();
					} else
						((Apple) basket[i]).jam();

				}
			}
			break;
			
		case 10:
			System.out.println("Thank you!!");
		}
		
	}while(ch!=10);// switch

		sc.close();
	
	}
	}

