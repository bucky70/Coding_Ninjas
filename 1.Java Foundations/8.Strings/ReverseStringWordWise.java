/*
Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always
*/
public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
        String rev="";
        String[] s=input.split("\\s");
        for(int i=0;i<s.length;i++){
            rev=s[i]+" "+rev;
        }
      return rev;
	}
}
//tutorial code

// public class Main
// {
// 	public static void main(String[] args) {
// 		String str="Hello sai kumar padamati garu";
// 		 int start=0;
// 		 String ans="";
// 		 int i=0;
// 		for(i=0;i<str.length();i++){
// 		   if(str.charAt(i)==' '){
// 		       int end=i;
// 		       String rev="";
// 		       for(int j=start;j<end;j++){
// 		           rev= str.charAt(j)+rev;
// 		       }
// 		      ans=ans+rev+ " ";
// 		      start=i+1;
// 		   }
// 		}
// 		  int end=i;
// 		       String rev="";
// 		       for(int j=start;j<end;j++){
// 		           rev= str.charAt(j)+rev;
// 		       }
// 		      ans=ans+rev+ " ";
// 		      start=i+1;
// 		System.out.println(ans);
// 	}
// }