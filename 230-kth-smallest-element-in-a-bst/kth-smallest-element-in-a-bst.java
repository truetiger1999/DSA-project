/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int count =0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
      recur(root, k);
      return ans;
  }

  public void recur(TreeNode root, int k){
      if(root.left!=null){
           recur(root.left, k);
      }
      count++;

      if(count==k){
          ans = root.val;
          return;
      }
      if(root.right!=null){
          recur(root.right, k);
      }
  }
}