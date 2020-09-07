import java.lang.Math;
import java.util.*;
class Player
{
public int guess_int;
public int getGint() {
return this.guess_int;
}
public void setGint(int guess_int) {
this.guess_int= guess_int;
}
}

class GuessGame
{
public void startGame()
{
Player p1 = new Player();
Player p2 = new Player();
Player p3 = new Player();
int guess_number = (int)(Math.random()*10);
Scanner scan = new Scanner(System.in);
p1.setGint(-1);
p2.setGint(-1);
p3.setGint(-1);
while(p1.getGint()!=guess_number || p2.getGint()!=guess_number || p3.getGint()!=guess_number)
{
System.out.println("Number to guess is " + guess_number);
System.out.print("I\'m guessing ");
p1.setGint(scan.nextInt());
System.out.print("I\'m guessing ");
p2.setGint(scan.nextInt());
System.out.print("I\'m guessing ");
p3.setGint(scan.nextInt());
System.out.println();
System.out.println("Player one guessed " + p1.getGint());
System.out.println("Player two guessed " + p2.getGint());
System.out.println("Player three guessed " + p3.getGint());
if(p1.getGint()!=guess_number && p2.getGint()!=guess_number && p3.getGint()!=guess_number)
{
System.out.println("Players will have to try again");
}
else
{
break;
}
}
System.out.println("We have a winner!");
if(p1.getGint() == guess_number)
{
System.out.println("Player one got it right? True");
System.out.println("Player two got it right? False");
System.out.println("Player three got it right? False");
}
else if(p2.getGint()==guess_number)
{
System.out.println("Player one got it right? False");
System.out.println("Player two got it right? True");
System.out.println("Player three got it right? False");
}
else
{
System.out.println("Player one got it right? False");
System.out.println("Player two got it right? False");
System.out.println("Player three got it right? True");
}
System.out.print("Game Over");
}
}

class GameLauncher
{
public static void main(String[] args)
{
GuessGame guessgame = new GuessGame();
guessgame.startGame();
}
}

