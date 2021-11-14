/* 
Given a generic tree, print the input tree in level wise order. That is, print the elements at same level in one line (separated by space). Print different levels in differnet lines.
Input format :
Elements in level order form separated by space (as per done in class). Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element 
Output Format :
Level wise print
Sample Input :
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output :
10
20 30 40 
40 50
*/
import java.util.LinkedList;
import java.util.Queue;
public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	
	
	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		// Queue<TreeNode<Integer>> pendingElements=new LinkedList<TreeNode<Integer>>();
		// pendingElements.add(root);
		// while(!pendingElements.isEmpty()) {
		// 	TreeNode<Integer> frontNode;
		// 	try {
		// 		frontNode = pendingElements.remove();
		// 		String s=frontNode.data+":";
		// 		System.out.print(s);
		// 		for(int i=0;i<frontNode.children.size();i++) {
		// 			s=frontNode.children.get(i).data+",";
		// 			System.out.print(s);
		// 			pendingElements.add(frontNode.children.get(i));
		// 		}
		// 		System.out.println();
		// 	} catch (Exception e) {
		// 		// TODO Auto-generated catch block
		// 		e.printStackTrace();
		// 	}		
		// }
        
        
          QueueUsingLL<TreeNode<Integer>> queue=new QueueUsingLL<>();
        queue.enqueue(root);
        queue.enqueue(null);

       
        
        
        while(!queue.isEmpty()){
            try{
            
            TreeNode<Integer> front=queue.dequeue();
          
            if(front==null){
                if(queue.isEmpty())
                    break;
                
                System.out.println();
                queue.enqueue(null);

            
            
            }
            
            else{
               
            System.out.print(front.data+" ");
            for(int i=0;i<front.children.size();i++){
                queue.enqueue(front.children.get(i));
            }
                
            }
           
        }catch(Exception e){
            return;
        }
            
        }

	}
		
}
