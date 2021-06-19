/*
Parallelogram Pattern
Send Feedback
Write a program to print parallelogram pattern for the given N number of rows.
For N = 4



The dots represent spaces.
Input Format :
 A single integer : N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
***
 ***
  ***
Sample Input 2 :
5
Sample Output 2 :
*****
 *****
  *****
   *****
    *****
*/
import java.util.Scanner;
public class ParallelogramPattern{
	
	public static void main(String[] args) {
		// Write your code here
Scanner s=new Scanner(System.in);
        	int n=s.nextInt();
        for(int i=0;i<n;i++){
          for(int j=0;j<=i;j++){
              if(j==i){
                  System.out.print("*");
              }
              else{
                  System.out.print(" ");
              }
          }
          for(int d=1;d<=n-1;d++){
              System.out.print("*");
          }
              System.out.println("");
          }
	}
}
