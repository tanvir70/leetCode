class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true; // An empty tree is symmetric
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true; // Both nodes are null, symmetric
        if (p == null || q == null) return false; // One is null, not symmetric
        if (p.val != q.val) return false; // Values do not match, not symmetric

        // Compare left subtree of `p` with right subtree of `q` and vice versa
        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
}
