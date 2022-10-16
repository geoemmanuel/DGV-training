class Player
{
String name;
int score;
String team;

public String getName()
{
return name;
}

public void setName(String n){

name=n
}
public Int getScore()
{
return score;
}
{
public void setScore(int s)
}
public String getTeam()
{
return team;
}
public void setName(string t){
team=t;
}
}
class Demo
{
public static void main(String args[])
{
Player p= new Player();
System.out.println("enter name");
string name= sc.nextline();
p.setname(name);
 System.out.println("enter score");
int score= sc.nextline();
p.setscore(score);
System.out.println("enter team");
string name= sc.nextline();
p.setteam(team);
system.out.println(p.getname());
system.out.println(p.getscore());
system.out.println(p.getteam());
}
}