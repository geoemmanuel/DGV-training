package convertor;

import java.util.Scanner;

import controller.controllers;

public class convert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		controllers controller = new controllers();
		int choice;
		
		
		
		do {
			System.out.println("Enter the choice to convert currencies");
			System.out.println(" 1.USD TO INR");
			System.out.println(" 2.AUD TO INR");
			System.out.println(" 3.UAED TO INR");
			System.out.println(" 4.JPY TO INR");
			System.out.println(" 5.ESP TO INR");
			choice=scanner.nextInt();
			
			switch(choice) {
				
			case 1:{
				System.out.println("Enter the amount to convert the currency from USD to INR");
				controller.usdToInr();
				break;
			}
			case 2:{
				System.out.println("Enter the amount to convert the currency from AUD to INR");
				controller.audToInr();
				break;
			}
			case 3:{
				System.out.println("Enter the amount to convert the currency from UAED to INR");
				controller.cadToInr();
				break;
			}
			case 4:{
				System.out.println("Enter the amount to convert the currency from JPY to INR");
				controller.jpyToInr();
				break;
			}
			case 5:{
				System.out.println("Enter the amount to convert the currency from ESP to INR");
				controller.espToInr();
				break;
			}
			default:{
				System.out.println("You have exited from the app");
			}
			}
			
		}while(choice != 0);
		

	}
}