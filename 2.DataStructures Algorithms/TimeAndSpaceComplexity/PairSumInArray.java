/* 
Pair sum in array
Send Feedback
You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs in the array/list which sum to 'num'.
Note:
Given array/list can contain duplicate elements. 
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains an integer 'num'.
Output format :
For each test case, print the total number of pairs present in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^4
0 <= num <= 10^9

Time Limit: 1 sec
Sample Input 1:
1
9
1 3 6 2 5 4 3 2 4
7
Sample Output 1:
7
Sample Input 2:
2
9
1 3 6 2 5 4 3 2 4
12
6
2 8 10 5 -2 5
10
Sample Output 2:
0
2


 Explanation for Input 2:
Since there doesn't exist any pair with sum equal to 12 for the first query, we print 0.

For the second query, we have 2 pairs in total that sum up to 10. They are, (2, 8) and (5, 5).
*/
public class Solution {	

     public static void mergeSort(int[] input){
		// Write your code here
        if(input.length<=1){
            return;
        }
        int[] L=new int[input.length/2];
        int[] R=new int[input.length-L.length];
		for(int i=0;i<L.length;i++){
            L[i]=input[i];
        } 
        for(int j=input.length/2;j<input.length;j++){
            R[j-input.length/2]=input[j];
        }
        mergeSort(L);
        mergeSort(R);
        merge(L,R,input);
      
	}
    public static void merge(int[] s1, int[] s2, int[] d){
        int i=0;
        int j=0;
        int k=0;
        while(i<s1.length && j<s2.length){
            if(s1[i]<s2[j]){
                d[k]=s1[i];
                    i++;
            }
            else{
                d[k]=s2[j];
                j++;
            }
            k++;
        }
       if(i<s1.length){
            while(i<s1.length){
             d[k]=s1[i];
             i++;
             k++;
        }
       }
        if(j<s2.length){
             while(j<s2.length){
             d[k]=s2[j];
             j++;
             k++;
        }
        }
    }
	public static int pairSum(int[] arr, int num) {
		//Your code goes here
        mergeSort(arr);
       
        int i=0;
        int ans=0;
        int j=arr.length-1;
        while(i<j) {
          if(arr[i]+arr[j]>num) {
            j--;
          }
          else if (arr[i]+arr[j]<num) {
            i++;
          }
          else {
            if(arr[i]==arr[j]){
              int count=j-i+1;
               ans+=((count)*(count-1))/2;
              i=j;
            }
            else{
              int counti=0;
              int countj=0;
              int start=i;
              int temp=arr[i];
              while(arr[start]==temp && start<=j) {
                counti++;
                start++;
              }
              temp=arr[j];
              int end=j;
              while(arr[end]==temp && end>=i){
                end--;
                countj++;
              }
              i=start;
              j=end;
              ans+=counti*countj;
            }
          }     
	}
        return ans;
}
}