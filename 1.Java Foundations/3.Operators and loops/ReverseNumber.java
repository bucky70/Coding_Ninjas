/* 
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.


Input format :
Integer N
Output format :
Corresponding reverse number
Constraints:
0 <= N < 10^8
Sample Input 1 :
1234
Sample Output 1 :
4321
Sample Input 2 :
1980
Sample Output 2 :
891
*/

import java.util.Scanner;
    public class ReverseNumber {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s= new Scanner(System.in);
        int x= s.nextInt();
        int r,rev=0;
        if(true){
            while(x%10==0&&x>0){
            x=x/10;
        }
        while(x>0){
            r=x%10;
            rev=10*rev+r;
            x=x/10;
        }
       System.out.println(rev);

        }
	}
}
