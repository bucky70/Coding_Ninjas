/*
Number Star pattern 1
Send Feedback
Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
*/
import java.util.Scanner; 
    public class NumberStarPattern {

	public static void main(String[] args) {
		// Write your code here
 Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        for(int i=n-1;i>=0;i--){
            int r=n;
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print("*");
                    r--;
                }
                else{
                    System.out.print(r);
                    r--;
                }
               
            }
            System.out.println("");
        }
	}
}
