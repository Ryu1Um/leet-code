package example.add_binary;

import java.math.BigInteger;

public class Solution {

    public String addBinary(String a, String b) {
        var num1 = new BigInteger(a, 2);
        var num2 = new BigInteger(b, 2);
        return num1.add(num2).toString(2);
    }
}
