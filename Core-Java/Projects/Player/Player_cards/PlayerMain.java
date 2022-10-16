package Player_cards;
import java.util.Scanner;




public class PlayerMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		PlayerController p = new PlayerController();
	
		int choice;
		do
		{
			System.out.println("Enter Your Choice");
			System.out.println("1.Add Player");
			System.out.println("2.View Players");
			System.out.println("3.Delete Player");
			System.out.println("4.Sort Players");
			System.out.println("5.Update Player");
			System.out.println("0.Exit");
		
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:{
					p.addPlayer();
					 break;
					 }
				case 2:{
					p.viewPlayers();
					 break;
					 }
				case 3:{
					p.deletePlayers();
					 break;
					 }
				case 4:{
					p.sortPlayers();
					 break;
				     }
				case 5:{
					p.updatePlayer();
					 break;
					 }
				default:{
				System.out.println("Exited the game");
					 }
			}
			
		}

	while (choice !=0);
}
}
			
