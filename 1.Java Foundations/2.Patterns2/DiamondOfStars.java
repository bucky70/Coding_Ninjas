/*
Code : Diamond of stars
Send Feedback
Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5



The dots represent spaces.



Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *
*/
import java.util.Scanner;
public class DiamondOfStars {


	public static void main(String[] args) {
		
			Scanner s=new Scanner(System.in);
	//Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>=1 && n<=49 ){
		    int n1=(n+1)/2;
		    int n2=n1-1;
            for(int i=1;i<=n1;i++){
		   
		       
		        for(int j=n1;j>=1;j--){
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
         //code here
         for(int i=1;i<=n2;i++){
    for(int j=1;j<=n2;j++){
		       if(j>i){
		        System.out.print("*");
		       }
		       else{
		           System.out.print(" ");
		       }
		      
		    }
             for(int d=n2-i+1;d>=1;d--){
		           System.out.print("*");
		       }
		        System.out.println("");
		    
		   
		}
         
            
		}
	}

}
