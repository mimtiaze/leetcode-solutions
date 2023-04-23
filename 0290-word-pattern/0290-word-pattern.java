import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> list = new HashMap<>();

        int index = 0, n = pattern.length();
        StringTokenizer tok = new StringTokenizer(s, " ");
        if (tok.countTokens() != n) return false;

        while (tok.hasMoreTokens()) {
            String tstr = tok.nextToken();
            if (list.containsKey(tstr)) {
                if (list.get(tstr) != pattern.charAt(index)) 
                    return false;
            } else {
                if (list.containsValue(pattern.charAt(index)))
                    return false;
                list.put(tstr, pattern.charAt(index));
            }

            index++;
        }



        return true;
    }
}