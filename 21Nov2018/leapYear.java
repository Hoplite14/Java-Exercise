
/**
 * Write a description of class assa here.
 *
 * @author (Bipin)
 * @version (2018/11/21)
 */
import java.util.Scanner;
public class leapYear{
    public static void main(String[]args){
    int year;
    Scanner reader = new Scanner(System.in);
    System.out.println("Type in the year");
    year = reader.nextInt();
    if((year < 100) && (year % 4 == 0)){
        System.out.println("The given year is a leap year");
    }else{
        if( ( (year % 4 == 0) ) && (year %100 !=  0)|| (year % 400 == 0)  ){
            System.out.println("The given year is a leap year");
        }
        else{
            System.out.println("The given year is a common year");
    }   
}
}
}
