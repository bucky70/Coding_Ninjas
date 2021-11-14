/* 
You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
Note :
Given array/list can contain duplicate elements.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains an integer 'X'.
Output format :
For each test case, print the total number of triplets present in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= X <= 10^9

Time Limit: 1 sec
Sample Input 1:
1
7
1 2 3 4 5 6 7 
12
Sample Output 1:
5
Sample Input 2:
2
7
1 2 3 4 5 6 7 
19
9
2 -5 8 -6 0 5 10 11 -3
10
Sample Output 2:
0
5


 Explanation for Input 2:
Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
*/
public class Solution {
    public static void mergeSort(int[] input) {
        // Write your code here
        if (input.length <= 1) {
            return;
        }
        int[] L = new int[input.length / 2];
        int[] R = new int[input.length - L.length];
        for (int i = 0; i < L.length; i++) {
            L[i] = input[i];
        }
        for (int j = input.length / 2; j < input.length; j++) {
            R[j - input.length / 2] = input[j];
        }
        mergeSort(L);
        mergeSort(R);
        merge(L, R, input);

    }
    public static void merge(int[] s1, int[] s2, int[] d) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < s1.length && j < s2.length) {
            if (s1[i] < s2[j]) {
                d[k] = s1[i];
                i++;
            } else {
                d[k] = s2[j];
                j++;
            }
            k++;
        }
        if (i < s1.length) {
            while (i < s1.length) {
                d[k] = s1[i];
                i++;
                k++;
            }
        }
        if (j < s2.length) {
            while (j < s2.length) {
                d[k] = s2[j];
                j++;
                k++;
            }
        }
    }
    public static int tripletSum(int[] arr, int num) {
        //Your code goes here
        mergeSort(arr);
        int n = arr.length;
        int np = 0;
        for (int i = 0; i < n; i++) {
            int k = i + 1;
            int j = n - 1;
            while (k < j) {
                if (arr[i] + arr[j] + arr[k] > num) {
                    j--;
                } else if (arr[i] + arr[j] + arr[k] < num) {
                    k++;
                } else {
                    if (arr[k] == arr[j]) {
                        int count = j - k + 1;
                        np += ((count) * (count - 1)) / 2;
                        k = j;
                    } else {
                        int countk = 0;
                        int countj = 0;
                        int start = k;
                        int temp = arr[k];
                        while (arr[start] == temp && start <= j) {
                            countk++;
                            start++;
                        }
                        temp = arr[j];
                        int end = j;
                        while (arr[end] == temp && end >= k) {
                            end--;
                            countj++;
                        }
                        k = start;
                        j = end;
                        np += countk * countj;
                    }
                }
            }
        }
        return np;
    }
}