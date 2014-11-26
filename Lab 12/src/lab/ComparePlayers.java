package lab;

//**************************************************************
//ComparePlayers
//
//Reads in two Player objects and tells whether they represent
//the same player.
//**************************************************************
import java.util.Scanner;
public class ComparePlayers
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        Player p1= new Player();
        System.out.println("Please enter the first players information");
        p1.readPlayer();
        //Player p2 = p1;
        Player p2= new Player();
        System.out.println("Please enter the second players information");
        p2.readPlayer();
        System.out.println((p1.equals(p2)?"Same player":"Different player"));
    }
}