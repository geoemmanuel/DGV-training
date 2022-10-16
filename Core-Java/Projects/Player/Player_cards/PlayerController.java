package Player_cards;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import modules.SortPlayers;


public class PlayerController {
	Player[] players=new Player[5];
	Scanner sc= new Scanner(System.in);
	int playerCount=0;
	
	public void addPlayer()
	{
		int index=0;
		for(int i=0;i<5;i++)
		{
			if(players[i]==null);
			{
				index=i;
				break;
			}
		}
		System.out.println("Enter Name , Goals , Age , Club & Country Res");
		String name=sc.nextLine();
		int goals=sc.nextInt();
		int age=sc.nextInt();
		sc.nextLine();
		String club=sc.nextLine();
		String country=sc.nextLine();
		
		players[index]=new Player(name,goals,age,club,country);
		playerCount++;
	}
	
	
	
	public void viewPlayers()
	{
		for(int i=0;i<5;i++)
		{
			
         		if(players[i]!=null) 
			{
				System.out.println(players[i]);
			}
			else
			{
				break;
			}
	}
	}
	
	public void deletePlayers()
	{
		System.out.println("Enter the player to delete");
		int choice=sc.nextInt();
		players[choice]=null;
		for(int i=0;i<4;i++)
		{
			players[i]=players[i+1];
			
		}
	}
	
	public void sortPlayers()
	{
		Player[] playersCopy=new Player[playerCount];
		
		for(int i=0;i<playersCopy.length;i++)
		{
			playersCopy[i]=players[i];
		}
		
		Arrays.sort(playersCopy,new SortPlayers());
		
		for(Player p : playersCopy)
		{
			System.out.println(p);
		}
	}
		
		public void viewPlayerOps()
		{
			for(int i=0;i<5;i++)
			
			{
				if(players[i]!=null)
				{
					System.out.println((i+1)+" "+players[i].getName());
					
				}
				else
				{
					break;		
				}
			
			
		}
		}
	public void updatePlayer()
	{
		int playerNumber;
		int propertyNumber;
		this.viewPlayerOps();
		
		System.out.println("Choose Player By Number");
		playerNumber=sc.nextInt();
		
		System.out.println("Select a property");
		System.out.println("1.Name");
		System.out.println("2.Goals");
		System.out.println("3.Age");
	 propertyNumber=sc.nextInt();
	
	switch(propertyNumber)
	{
		case 1: {
			System.out.println("Enter Name");
			String name=sc.nextLine();
			players[playerNumber-1].setName(name);
			break;
	       }
	
		case 2:{
			System.out.println("Enter Goals");
			int goals=sc.nextInt();
			players[playerNumber-1].setGoals(players[playerNumber-1].getGoals()+goals);
			break;
	           }
		case 3:{
			System.out.println("Enter Age");
			int age=sc.nextInt();
			players[playerNumber-1].setAge(age);
	         }
	}
      }
	}

