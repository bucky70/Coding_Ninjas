/* 
Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format :
String S
Output Format :
Minimum length word
Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a
*/
import java.util.HashMap;
public class Solution {
	
	public static String minLengthWord(String input){
		
		// Write your code here
        String[] words=input.split("\\s");
        String val="";
        int min=Integer.MAX_VALUE;
       HashMap<Integer,String> map=new HashMap<Integer,String>();
        for(String x:words){
            map.put(x.length(),x);
        }
        for(String x:words){
            if(min>x.length()){
                min=x.length();
                val=x;
            }
        }
      // return map.get(min);
        return val;
	}
}
