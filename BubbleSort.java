import java.util.Calendar; 
/**
 * Write a description of class BubbleSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort
{
    public static long main(String[] args)
    {
        int[] nums = new int[30000];
        int[] nums2 = {2, 25, 4, 93};

        for (int i = 0; i < nums.length; i++)
        {
            int rand = (int)(Math.random()*50) + 1;
            nums[i] = rand; 
        }

        int max = 0;
        int maxIndex = -1;

        Calendar myCal = Calendar.getInstance();
        long start = myCal.getTimeInMillis();
        
        // // for(int j = 0; j < nums.length; j++)
        // // {
        // // if (nums[j] > max)
        // // {
        // // max = nums[j];
        // // index = j; 
        // // }
        // // }

        // System.out.println("Largest number: " + max + " Index value: " + index); 

        // int temp = nums[index];
        // nums[index] = nums[nums.length-1];
        // nums[nums.length-1] = temp; 

        int counter = 0; 
        for (int j : nums)
        {
            for (int i = 0; i < nums.length-1; i++)
            {
                counter++;
                if (nums[i] > nums[i+1])
                {
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp; 
                }
            }
        }
        //System.out.println("Times thru inner loop: " + counter); 

        myCal = Calendar.getInstance();
        long end = myCal.getTimeInMillis();
        System.out.println("*** Time to sort Bubble: " + (end-start) + " milliseconds");
        
        // for (int i = 0; i < nums.length; i++)
        // {
            // System.out.println(nums[i]);
        // }
        return (end-start);
    }
     
}
