/* 
Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
using recursion.
Input format :
Integer k
Output format :
Geometric sum (upto 5 decimal places)
Constraints :
0 <= k <= 1000
Sample Input 1 :
3
*/

public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
        double sum=0;
        if(k==0){
            return 1;
        }
        else{
          sum=sum+0.5*findGeometricSum(k-1);  
            return sum+1;
        }  

	}
}
