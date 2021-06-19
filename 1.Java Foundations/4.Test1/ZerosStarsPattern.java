/* 
Print the following pattern
Pattern for N = 4
*000*000*
0*00*00*0
00*0*0*00
000***000
Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Sample Input 1 :
3
Sample Output 1 :
*00*00*
0*0*0*0
00***00
Sample Input 2 :
5
Sample Output 2 :
*0000*0000*
0*000*000*0
00*00*00*00
000*0*0*000
0000***0000
*/
import java.util.Scanner; 
    public class ZerosStarsPattern {

	public static void main(String[] args) {
		// Write your code here
 Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        for(int i=0;i<n;i++){
            int r=0;
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print("*");
                    
                }
                else{
                    System.out.print(r);
                   
                }
               
            }
            System.out.print("*");
            for(int d=n-1;d>=0;d--){
                if(d==i)
                System.out.print("*");
                else
                System.out.print("0");
            }
             System.out.println("");
        }
	}
}

