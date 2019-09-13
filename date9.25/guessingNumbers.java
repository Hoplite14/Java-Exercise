import java.util.Random;
import java.util.Scanner;
public class guessingNumbers{
    public static void main(String[]args){
        System.out.println("i'm thinking of a number between 1 and 100(including both).Can you guess what it is ?");
        Scanner reader = new Scanner(System.in);
        System.out.println("\nType a number: ");
        int num1 = reader.nextInt();
        System.out.println("Your guess is :"+ num1);
        Random random = new Random();
        int num = random.nextInt(100)+1;
        System.out.println("The number I was thinking is "+num);        
        System.out.println("You were off by "+(num1 - num));
    }
}
