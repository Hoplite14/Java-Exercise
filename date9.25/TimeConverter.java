import java.util.Scanner;
public class TimeConverter{
    public static void main(String[]args){
        int seconds, number, hours, minutes;
        Scanner reader = new Scanner(System.in);
        System.out.println("\nType in the number");
        number = reader.nextInt();
        hours = number/(60*60);
        minutes = (number/60)%60;
        seconds = number%60;
        System.out.printf("%d Seconds = %d hours, %d minutes, %d seconds.",number,hours,minutes,seconds);
    }
}
    
        