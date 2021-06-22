/*
For a given input string(str), find and return the total number of words present in it.
It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and trailing spaces in the given input string.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints an integer value denoting the tool number of words present in the string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 sec
Sample Input 1:
Coding Ninjas!
Sample Output 1:
2
Sample Input 2:
this is a sample string
Sample Output 2:
5
*/

public class Solution {

	public static int countWords(String str) {	
		//Your code goes he
      
       //  String[] words=str.split("\\s");       
       //  if(str.length()==0||str==null||str.isEmpty()){
       //      return 0;
       //  }
       // return words.length;
         int state = OUT;
        int wc = 0;  // word count
        int i = 0;
         
        // Scan all characters one by one
        while (i < str.length())
        {
            // If next character is a separator, set the
            // state as OUT
            if (str.charAt(i) == ' ' || str.charAt(i) == '\n'
                    || str.charAt(i) == '\t')
                state = OUT;
                 
      
            // If next character is not a word separator
            // and state is OUT, then set the state as IN
            // and increment word count
            else if (state == OUT)
            {
                state = IN;
                ++wc;
            }
      
            // Move to next character
            ++i;
        }
        return wc;
	}
 
}