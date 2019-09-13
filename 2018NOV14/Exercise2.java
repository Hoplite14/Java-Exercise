/**
 * Write a description of class Boolean here.
 *
 * @author (bipin)
 * @version (2018/11/07)
 */
import java.util.Scanner;
 public class Exercise2{
    public static void main(String[]args){
        int num1, num2;
        Scanner reader = new Scanner(System.in);
        System.out.println("type in the 1st number");
        num1 = reader.nextInt();
        System.out.println("type in the 2nd number");
        num2 = reader.nextInt();
        if(num1>num2){
            System.out.printf("%d is larger than %d",num1,num2);
        } else{
            System.out.printf("%d is larger than %d",num2,num1);
        }
    }
}