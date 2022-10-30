package module;

import java.util.Scanner;

import controller.Controller;



public class Main {
	public static void main(String[] args) {
		Controller controller = new Controller();
		Scanner scanner = new Scanner(System.in);
		
		int Choice;
		System.out.println("Enter the name of Player1");
		String player1 = null;
		String Player1=scanner.nextLine();
		System.out.println("Enter the name of Player2");
		String player2 = null;
		String Player2=scanner.nextLine();
		do
		{
			System.out.println("Select Your Choice");
			System.out.println("1.Play Game");
			System.out.println("2.View Streak");
			System.out.println("3.Exit ");
			
			Choice = scanner.nextInt();
			scanner.nextLine();
			switch(Choice) 
			{
			
			case 1:{
				
				controller.playGame(player1,player2);
				
				break;
			}
			case 2:{
				controller.viewStreak();
				
				break;
			}
			
			default:{
				System.out.println("You have exited!");
				break;
			}
			}
		
		}while(Choice!=0);		
	}
}
