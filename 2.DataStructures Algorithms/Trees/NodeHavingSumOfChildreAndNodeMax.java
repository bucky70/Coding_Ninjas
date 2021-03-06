/* 
Given a tree, find and return the node for which sum of data of all children and the node itself is maximum. In the sum, data of node itself and data of immediate children is to be taken.
Input format :

Line 1 : Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Output format : Node with maximum sum.

Sample Input 1 :
5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
Sample Output 1 :
1
*/

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
	
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
        return maxSumNodeHelper(root).root;
	}
    public static nodePair maxSumNodeHelper(TreeNode<Integer> root){
        if(root==null){
            nodePair result=new nodePair(root,Integer.MIN_VALUE);
            return result;
        }
        int sum=root.data;
        for(TreeNode<Integer> child:root.children){
            sum+=child.data;
        }
        nodePair result=new nodePair(root,sum);
        for(int i=0;i<root.children.size();i++){
            nodePair childResult=maxSumNodeHelper(root.children.get(i));
            if(result.sum<childResult.sum){
                result=childResult;
            }
        }
        return result;
    }
	
		
}
class nodePair{
    TreeNode<Integer> root;
    int sum;
    public nodePair(TreeNode<Integer> root,int sum){
        this.root=root;
        this.sum=sum;
    }
}