package example;

import example.symmetric_tree.Solution;
import example.symmetric_tree.TreeNode;


public class LeetCodeMain {

    public static void main(String[] args) {
        var solution = new Solution();

        var tree4 = new TreeNode(2);
        var tree3 = new TreeNode(2);
        var tree2 = new TreeNode(2, tree3, tree3);
        var tree21 = new TreeNode(2, tree4, tree4);
        var tree1 = new TreeNode(1, tree21, tree2);
        System.out.println(solution.isSymmetric(tree1));
    }
}
