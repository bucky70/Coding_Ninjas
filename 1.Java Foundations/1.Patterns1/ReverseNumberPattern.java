/*
Code : Reverse Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
21
321
4321
54321
Sample Input 2:
6
Sample Output 2:
1
21
321
4321
54321
654321
*/
import java.util.Scanner;
public class ReverseNumberPattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=1;
        for(int i=1;i<=n;i++){
             count=i;
            for(int j=1;j<=i;j++){
                if(count!=0){
                    System.out.print(count);
                count=count-1;
                }
                
            }
           
            System.out.println("");
        }

		
	}

}
