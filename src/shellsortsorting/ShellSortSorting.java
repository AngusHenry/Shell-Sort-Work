/*
 * Angus Henry
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
        System.out.println ("How many numbers do you want to sort 10 ,100, 1000, 10000, 100000");
        int number;
        int i, j;
        int maths;
        i = input.nextInt();

         int[] random = new int[i];
       
       
       for(j = 0; j < i; j++){
        maths = (int)(Math.random() * i);
          random[j] = maths;
       }
        ShellSortSorting ob = new ShellSortSorting(); 
        ob.sort(random);
        printArray(random); 
    }
    int sort (int nums[]){
   int n = nums.length;
   for (int k = n/2; k > 0; k /=2){
       for (int i = k; i < n; i+=1){
           int temp = nums[i];
           int comp;
           for (comp = i; comp >= k && nums[comp - k] > temp; comp -= k){
               nums[comp] = nums[comp - k];
               nums[comp] = temp;
           } 
       }
   }
   return 0;
    }
    
//    nt sort(int arr[]) { 
//        int n = arr.length; 
//        for (int gap = n/2; gap > 0; gap /= 2) { 
//            for (int i = gap; i < n; i += 1) { 
//                int temp = arr[i]; 
//                int j; 
//                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
//                    arr[j] = arr[j - gap]; 
//                arr[j] = temp; 
//            } 
//        } 
//        return 0; 
//    }
    static void printArray(int nums[]) 
    { 
        int n = nums.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(nums[i] + " "); 
        System.out.println(); 
    } 
    
}
