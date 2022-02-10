import java.util.Scanner; 
/**
 * Write a description of class BinarySearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearch
{
    public static void main(String[] args)
    {
        int[] nums = InsertionSort.main(null); 
        
        for (int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.print("What number should I find?");
        int answer = scan.nextInt(); 
        
        int loIndex = 0;
        int hiIndex = nums.length-1;
        int midIndex = (loIndex+hiIndex)/2; 
        
        while (nums[midIndex] != answer && loIndex <= hiIndex)
        {
            if (nums[midIndex] < answer)
            {
                loIndex = midIndex;
            }
            else 
            {
                hiIndex = midIndex; 
            }
            midIndex = (loIndex+hiIndex)/2;
        }
        System.out.println("The index of your number is " + midIndex); 
    }
}
