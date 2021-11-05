/*
Sort an array A using Quick Sort.
Change in the input array itself. So no need to return or print anything.


Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
1 5 2 7 3
Sample Output 2 :
1 2 3 5 7 
*/

public class Solution {
    public static int partition(int[] array,int low,int high){
    int pivot = array[high];
    int i = (low - 1);

    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {
      i++;
     int temp = array[i];
     array[i] = array[j];
     array[j] = temp;
   }

 }
 int temp = array[i + 1];
 array[i + 1] = array[high];
 array[high] = temp;
 return (i + 1);
    }
	
	 public static void quickSort(int[] input) {
        quickSort(input,0,input.length-1);

    }
    public static void quickSort(int[] input,int sI,int eI){
    //base case
       if(sI>=eI)
           return;
        
        int pivotPos=partition(input,sI,eI);
        quickSort(input,sI,pivotPos-1);
        quickSort(input,pivotPos+1,eI);
    }
	
}