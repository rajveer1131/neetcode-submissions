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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> q= new LinkedList<>();

        if (root != null) {
            q.add(root);
        }

        while(!q.isEmpty()){
            
            List<Integer> ll=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){

                TreeNode temp=q.poll();
                ll.add(temp.val);

                if(temp.left!=null){
                    q.offer(temp.left);
                }

                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            ans.add(ll);
            // ll.clear();
        }
        return ans;
        
    }
}
