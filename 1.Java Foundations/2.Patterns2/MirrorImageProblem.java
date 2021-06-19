/*
Code : Mirror Image Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4




The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
3
Sample Output 1:
      1 
    12
  123
Sample Input 2:
4
Sample Output 2:
      1 
    12
  123
1234
*/
import java.util.Scanner;
public class MirrorImageProblem {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
 Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        // char r='A';
          for(int i=0;i<=n;i++){
              // r=(char)('A'+i);
              int r=1;
              for(int j=n;j>0;j--){
                 if(j<=i)
                  {
                      System.out.print(r);
                      r++;}
                  else
                  System.out.print(" ");
                 // r=(char)(r+1);
                 
              }
             
              System.out.println("");
          }
		
	}

}
