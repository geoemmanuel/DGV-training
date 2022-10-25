package QuizMain;

import java.util.Scanner;

import Controller.QuizController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int userChoice;
		QuizController quizController = new QuizController();
		quizController.rankData();
		do {
			System.out.println();
			System.out.println("Select your choice");
			System.out.println("1. Try Quiz");
			System.out.println("2. View LeaderBoard");
			System.out.println("3. Exit");
			userChoice = scanner.nextInt();
			scanner.nextLine();
			switch(userChoice) {
			case 1:{
				System.out.println("Enter your name");
				String userName = scanner.nextLine();
				quizController.generateQuiz(userName);
				break;
			}case 2:{
				quizController.viewRanking();
				break;
			}default:{
				System.out.println("You have exited the game");
				break;
			}
			}
		}while(userChoice!=0);
	}

}