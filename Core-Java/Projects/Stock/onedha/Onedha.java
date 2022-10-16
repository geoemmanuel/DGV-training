package onedha;
import java.util.Scanner;

import controllers.Stockcontrollers;
public class Onedha {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int choice;
		Stockcontrollers stockController=new Stockcontrollers();
		stockController.add();
		
		do {
			System.out.println("Enter your choice");
			System.out.println("1. View Stocks");
			System.out.println("2. View Perfomance ");
			System.out.println("3. Sort Stocks");
			System.out.println("4. Search Stocks");
			System.out.println("5. Display ROI");
			 choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:{
				stockController.displayStocks(); 
				break;
			}
			case 2:{
				stockController.displayPerformance();
				break;		
			}
			case 3:{
				stockController.sortedStock();
				break;
			}
			case 4: {
				System.out.println("Enter the Stock to search");
				String userinput = scanner.nextLine();
				stockController.searchStock(userinput);
				break;
			}
			case 5:{
				System.out.println("Details of ROI");
				System.out.println("Enter the Stock Name");
				String name = scanner.nextLine();
				System.out.println("Month");
				int month = scanner.nextInt();
				stockController.displayRoi(name, month);
				break;
			
		    }
			default:{
				System.out.println("YOU QUITED!!!");
				break;
			}

			}
			
		}
		while(choice!=0);

		
	}
}
