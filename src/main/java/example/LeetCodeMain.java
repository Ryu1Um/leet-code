package example;

import example.same_tree.Solution;
import example.same_tree.TreeNode;


public class LeetCodeMain {

    public static void main(String[] args) {
        var solution = new Solution();

        var tree2 = new TreeNode(2);
        var tree3 = new TreeNode();
        var tree1 = new TreeNode(1, tree2, tree3);
        solution.isSameTree(tree1, tree1);
    }
}
