import java.util.Calendar; 
/**
 * Write a description of class InsertionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsertionSort
{
    public static int[] main(String[] args)
    {
        int[] nums = new int[30];

        for (int i = 0; i < nums.length; i++)
        {
            int rand = (int)(Math.random()*100) + 1;
            nums[i] = rand; 
        }

        Calendar myCal = Calendar.getInstance();
        long start = myCal.getTimeInMillis();
        
        for (int i = 1; i < nums.length; i++)
        {
            int nextValue = nums[i]; // value of the number to sort
            int pos = i;
            
            while (pos > 0 && nextValue < nums[pos-1]) //shortcircuiting (order matters to prevent out of bounds errors)
            {
                nums[pos] = nums[pos-1];
                pos--;
            }
            nums[pos] = nextValue; 
        }//num sorted
        
        // for (int n: nums)
        // {
            // System.out.println(n);
        // }
        
        myCal = Calendar.getInstance();
        long end = myCal.getTimeInMillis();
        System.out.println("*** Time to sort insertion: " + (end-start) + " milliseconds");
    
        return nums;
    }
}
