//Problem link:   https://leetcode.com/problems/maximum-binary-tree/solution/

class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length-1);
    }
    public TreeNode construct(int[] a,int i,int j)
    {
        if(i>j)
            return null;
        int z=i;
        for(int x=i;x<=j;x++)
        {
            if(a[x]>a[z])
                z=x;
        }
        TreeNode r = new TreeNode(a[z]);
        r.left=construct(a,i,z-1);
        r.right=construct(a,z+1,j);
        return r;
    }
    
}
