package example.binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        var list = new ArrayList<Integer>();
        if (root == null) return list;
        return inorderTraversal(root, list);
    }

    private List<Integer> inorderTraversal(TreeNode root, List<Integer> resultList) {
        if (root != null) {
            inorderTraversal(root.left, resultList);
            resultList.add(root.val);
            inorderTraversal(root.right, resultList);
        }
        return resultList;
    }
}
