package example;

import example.remove_duplicates_from_sorted_list.ListNode;
import example.remove_duplicates_from_sorted_list.Solution;

public class LeetCodeMain {

    public static void main(String[] args) {
//        var listNode = new ListNode(3);
//        var listNode1 = new ListNode(3, listNode);
//        var listNode2 = new ListNode(2, listNode1);
//        var listNode3 = new ListNode(1, listNode2);
//        var listNode4 = new ListNode(1, listNode3);

        var listNode = new ListNode(1);
        var listNode1 = new ListNode(1, listNode);
        var listNode2 = new ListNode(1, listNode1);
        var solution = new Solution();
        solution.deleteDuplicates(listNode2);

    }
}
