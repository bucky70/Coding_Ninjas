/* 

public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
        	int k=0;
	int len=str.length();
    int count[] = new int[256];
    for(int i=0;i<len;i++){
        count[str.charAt(i)]++;
    } 
     int max=-1;
     for(int i=0;i<len;i++){
         if(max<count[str.charAt(i)])
         {max=count[str.charAt(i)];
         k=i;}
     }
     return str.charAt(k);
	}

}Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
Exmple:
If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

The string is compressed only when the repeated character count is more than 1.
Note :
Consecutive count of every character in the input string is less than or equal to 9.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aaabbccdsa
Sample Output 1:
a3b2c2dsa
Sample Input 2:
aaabbcddeeeee
Sample Output 2:
a3b2cd2e5
*/

public class Solution {

	public static String getCompressedString(String str) {
		//Your code goes here
        String res="";
       	int start=0;
	int n=str.length(),i=0;
	for(i=0;i<n;i++){
	    int j=0;
	    for(j=start;j<i;j++){
	        if(str.charAt(i)==str.charAt(j)){
	             break;
	        }
	       
	    }
	    if(i==j){
	        if(i-start>1)
	           res+=Integer.toString(i-start)+Character.toString(str.charAt(i)); 
	        
	        else
	           res+=Character.toString(str.charAt(i));
	        start=i;
	    }
	}
        if(i-start>1)
	        res+=Integer.toString(i-start);
        return res;
        
	}

}