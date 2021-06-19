/*
 Code : Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
 */
import java.util.Scanner;
public class IsocelesTriangle {


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>=0&&n<=50){
            for(int i=1;i<=n;i++){
		    for(int j=n;j>=1;j--){
		       if(j<=i){
		        System.out.print("*");
		       }
		       else{
		           System.out.print(" ");
		       }
		       
		    }
		    for(int d=i-1;d>=1;d--){
		           System.out.print("*");
		       }
		    System.out.println("");
		}
        }
	}

}
