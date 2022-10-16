import java.util.scanner;
class Player
{
String name;
int score;
int birthyear;
String game;

Scanner sc=new Scanner(System.in);

public void getDetails()
{
System.out.println("enter name, score, birthyear");
name=scanner.nextLine();
score=scanner.nextInt();
birthyear=scanner.nextInt();

}
public void dislpayDetails()
{
System.out.println(name+""+score+""+birthYear);
 }

public String getGame()
{
return game;
}

public void setGame(String g){

game=g
}

class Demo
{
public static void main(string args[])
{
Player p=new Player();
p.getDetails();
p.displayDetails();

public String getName()
{
return name;
}
public void setName(String n)
{
name=n
}
public int getScore()
{
return score;
}
public void setScore(int s)
{
score=s
}
public int getBirthyear()
{
return birthyear;
}
public void setBirthyear(int b)
{
birthyear=b
}
Player p = new Player();
System.out.println("Enter game");
String game= sc.nextline();
p.setgame(game);
System.out.println(p.getgame());
}

