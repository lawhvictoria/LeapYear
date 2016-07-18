/**
 *
 * @author Victoria
 */
public class Year {
    private int year;
    
    public Year(int y)
    {
        this.year = y;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public boolean isLeapYear()
    {
        return ((year > 1582) && (((year % 400) == 0) || ((year % 4) == 0 && (year % 100) != 0)));
        
//        if(((year % 400) == 0) || ((year % 4) == 0 && (year % 100) != 0))
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
    }
}
