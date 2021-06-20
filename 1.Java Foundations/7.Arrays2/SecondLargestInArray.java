/* 
You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.
If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31(It is the smallest value for the range of Integer)
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the array/list.

The second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the second largest in the array/list if exists, -2147483648 otherwise.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5

Time Limit: 1 sec
Sample Input 1:
1
7
2 13 4 1 3 6 28
Sample Output 1:
13
Sample Input 2:
1
5
9 3 6 2 9
Sample Output 2:
6
Sample Input 3:
2
2
6 6
4
90 8 90 5
Sample Output 3:
-2147483648
8
*/
public class Solution {  

    public static int secondLargestElement(int[] arr) {
    	//Your code goes here
//         int n=arr.length;  
//         int l=0,s=0;
//         for(int i=0;i<n;i++){
//             if(l<arr[i]){
//                 s=l;
//                 l=arr[i];
//             }
        // if(s>arr[i]&&arr[i]<l){
        //     a=arr[i];
        // }
//         }
        // int[] temp=Arrays.sort(arr);
//         if(n<=1||temp[0]==temp[n-1]){
//             return -2147483648;
//         }
//        return s; 
        if((arr.length<=1)||(arr[0]==arr[arr.length-1])) {
			return -2147483648;
		}
		
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>largest) {
			secondLargest=largest;
			largest=arr[j];
			}else if(arr[j]==largest) {
				continue;
			}else if(arr[j]<largest) {
				if(arr[j]>secondLargest) {
					secondLargest=arr[j];
				}
			}
		}
return secondLargest;

    }
    
}