import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class Lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int y = scan.nextInt();    
        
        Year year = new Year(y);
        
        System.out.println(year.isLeapYear());
    }
    
/*    private static boolean isLeapYear(int year){
        if((year % 4) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    } */
    
}
