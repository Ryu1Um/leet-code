package example.length_of_last_word;

public class Solution {

    public int lengthOfLastWord(String s) {
        var arrayWordsList = s.split(" ");
        for (int i = arrayWordsList.length - 1; i >= 0; i--) {
            var len = arrayWordsList[i].length();
            if (len != 0) return len;
        }
        return 0;
    }
}
