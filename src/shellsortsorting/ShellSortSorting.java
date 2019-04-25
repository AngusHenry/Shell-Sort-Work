/*
 * Angus, Nick, Vilmos, Lewis
 */

package shellsortsorting;

import java.util.Scanner;

/**
 *
 * @author anhen3335
 */
public class ShellSortSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println ("How many numbers do you want to sort?");
        int number;
        int i, j;
        int maths;
        i = input.nextInt();

         int[] random = new int[i];
       
       
       for(j = 0; j < i; j++){
           // geting the random numbers to sort
        maths = (int)(Math.random() * i);
          random[j] = maths;
       }
        ShellSortSorting ob = new ShellSortSorting(); 
        //long start = System.nanoTime(); // get starting time
        long start = System.currentTimeMillis();
        ob.sort(random);
        //long end = System.nanoTime(); // get ending time
        long end = System.currentTimeMillis();
        //double seconds = end/1000000000;
         System.out.println("Elapsed time: " + (end - start) + " Milliseconds");
         //System.out.println (seconds + "seconds");
        printArray(random); 
    }
    
    int sort(int arr[]) { 
        int n = arr.length; 
        for (int gap = n/2; gap > 0; gap /= 2){
            // creates the gaps by dividing the length and then the gap into 2
            for (int i = gap; i < n; i += 1) {
                // moving the gap along the array
                int temp = arr[i]; 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    // checking the numbers and then switching them if needed
                    arr[j] = arr[j - gap]; 
                arr[j] = temp; 
            } 
        } 
        return 0; 
        // return 0 because it needs a return so we could being in the array
    }
   /*
    * Prints out the now sorted numbers
    */
    static void printArray(int nums[]) 
    { 
        int n = nums.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(nums[i] + " "); 
        System.out.println(); 
    }
    
}
