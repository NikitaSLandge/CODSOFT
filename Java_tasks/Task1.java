import java.util.Random;
import java.util.Scanner;

class Game{
public int a,b,c=0;

public int game() {
Random random= new Random();
 a= random.nextInt(0,100);
return a;
}

public void getUserInput() {
 do{
Scanner sc= new Scanner(System.in);
 System.out.println("Guess the nubmer between 0-100: ");
b= sc.nextInt();
if (a>b) {
System.out.println("Think bigger number");
}
else if (a<b) {
System.out.println("Think for a smalller number");
}
c++;
 }
while (a!=b);
}

public void iscorrectnumber() {
System.out.println("Correct Guess"); 
}

public void numbofguess(){
System.out.println("total number of guesses: " +c);
if (c<=3){
System.out.println("Pro player");
}
else if (c>3 && c<7) {
System.out.println("Good player");
}
else {
System.out.println("nice try but can do better");
    }
  }


public static void main(String[] args) { 
    Game player= new Game();
    player.game();
    player.getUserInput();
    player.iscorrectnumber();
    player.numbofguess();
}
}
