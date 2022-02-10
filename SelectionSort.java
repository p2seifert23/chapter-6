import java.util.Calendar; 
/**
 * Write a description of class SelectionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelectionSort
{
    public static long main(String[] args)
    {
        int[] nums = new int[30000];

        for (int i = 0; i < nums.length; i++)
        {
            int rand = (int)(Math.random()*50) + 1;
            nums[i] = rand; 
        }

        Calendar myCal = Calendar.getInstance();
        long start = myCal.getTimeInMillis();
        
        for (int i = 0; i < nums.length-1; i++)  
        {
            int minIndex = i;
            for (int j = i+1; j < nums.length; j++)
            {
                if (nums[j] < nums[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        
        myCal = Calendar.getInstance();
        long end = myCal.getTimeInMillis();
        System.out.println("*** Time to sort Selection: " + (end-start) + " milliseconds");
        
        // for (int i = 0; i < nums.length; i++)
        // {
            // System.out.println(nums[i]);
        // }
        return (end-start);
    }
}
