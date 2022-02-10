
/**
 * Write a description of class SortComparison here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortComparison
{
    public static void main(String[] args)
    {
        long totalTime = 0; 
        for (int i = 0; i < 5; i++)
        {
            totalTime += BubbleSort.main(null);
            
        }
        System.out.println("Total " + totalTime + " Average " + (totalTime/5));
        
        totalTime = 0; 
        for (int i = 0; i < 5; i++)
        {
            totalTime += SelectionSort.main(null);
            
        }
        System.out.println("Total " + totalTime + " Average " + (totalTime/5));
        
        totalTime = 0; 
        for (int i = 0; i < 5; i++)
        {
            totalTime += InsertionSort.main(null);
            
        }
        System.out.println("Total " + totalTime + " Average " + (totalTime/5));
    }
}
