package controller;
import java.util.Scanner;

import module.Player;

public class Controller {
Scanner scanner= new Scanner(System.in);
Player user1;
Player user2;
String arr[] = new String[9];
public void addPlayer(String player1, String player2, int wins1, int wins2) {
	user1=new Player(player1,wins1);
	user2=new Player(player2,wins2);
}
public void displayMatrix() {
	int k=0;
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=3;j++) {
			System.out.print(arr[k]+" ");
			k++;
		}
		System.out.println();
	}
}
public int temp;

public void playGame(String player1,String player2) {
	arr=new String[] {"1","2","3","4","5","6","7","8","9"};
	int user1PositionInsert;
	int user2PositionInsert;
	this.displayMatrix();
	temp=1;
	do {
		System.out.println("Player1 play your turn");
	user1PositionInsert=scanner.nextInt();
	arr[user1PositionInsert-1]="x";
	this.displayMatrix();
	this.winGame(user1PositionInsert-1);
	if(temp==0) {
		break;
	}
	System.out.println("Player2 play your turn");
	user2PositionInsert=scanner.nextInt();
	arr[user2PositionInsert-1]="0";
	this.displayMatrix();
	this.winGame(user2PositionInsert-1);
	}while(temp!=0);
	String wins1 = null;
	String wins2 = null;
	this.addPlayer(player1,wins1,player2,wins2);
}

private void addPlayer(String player1, String wins1, String player2, String wins2) {
	// TODO Auto-generated method stub
	
}
public void winGame(int userPositionInsert) {
	if(
			(arr[0]==arr[4] && arr[4]==arr[8])||
			(arr[2]==arr[4] && arr[4]==arr[6])||
			(arr[0]==arr[1] && arr[1]==arr[2])||
			(arr[3]==arr[4] && arr[4]==arr[5])||
			(arr[6]==arr[7] && arr[7]==arr[8])||
			(arr[0]==arr[3] && arr[3]==arr[6])||
			(arr[1]==arr[4] && arr[4]==arr[7])||
			(arr[2]==arr[5] && arr[5]==arr[8])
				) {
			if(arr[userPositionInsert]=="x") {
				System.out.println("player1 wins");
				wins1++;
			}else{
				System.out.println("player2 wins");
				wins2++;
			}
			temp=0;
		}
}

public void viewStreak() {
			System.out.println(user1.getPlayer()+"  "+user1.getStreak());
			System.out.println(user2.getPlayer()+"  "+user2.getStreak());
}


	
}





