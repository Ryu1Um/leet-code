package example.find_the_index_of_the_first_occurrence_in_a_string;

public class Solution {

    public int strStr(String haystack, String needle) {
        try {
            var charArrayHayStack = haystack.toCharArray();
            var charArrayNeedle = needle.toCharArray();
            for (int i = 0; i < charArrayHayStack.length; i++) {
                var counter = 0;
                for (int j = 0; j < charArrayNeedle.length; j++) {
                    if (charArrayHayStack[i + j] == charArrayNeedle[j]) {
                        counter++;
                        if (counter == charArrayNeedle.length) return i;
                    }
                }
            }
        } catch (Exception e) {
            return -1;
        }
        return -1;
    }
}
