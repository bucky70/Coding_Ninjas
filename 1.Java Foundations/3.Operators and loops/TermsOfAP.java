/*
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
Input format :
Integer x
Output format :
Terms of series (separated by space)
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17
*/

import java.util.*;
import java.util.List;
import java.util.ArrayList; 
    public class TermsOfAP {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s= new Scanner(System.in);
        int x= s.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<100000;i++){
            int k=3*(i+1)+2;
            
            if(k%4!=0){
               list.add(k);
            }
        }
        for(int i=0;i<x;i++)
        {
             System.out.print(list.get(i)+" ");
        }

	}
}
