/**
 * Write a description of class Boolean here.
 *
 * @author (bipin)
 * @version (2018/11/07)
 */
import java.util.Scanner;
 public class Exercise1{
    public static void main(String[]args){
        int num, x;
        Scanner reader = new Scanner(System.in);
        System.out.println("type a number");
        num = reader.nextInt();
        x =num %2;
        if (x==0){
            System.out.println("The given number is even");
        }else{
            System.out.println("The given number is odd");
        }
       }
    }