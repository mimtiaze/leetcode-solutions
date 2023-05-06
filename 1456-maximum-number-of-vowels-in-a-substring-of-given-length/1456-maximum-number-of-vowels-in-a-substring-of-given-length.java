class Solution {
    public int maxVowels(String s, int k) {
        System.out.println();
        int maxV = 0;
        int tempV = 0;
        int i, j;
        
        for (j = 0; j<k; j++) {
            char ch = s.charAt(j);
            if (isVowel(ch))
                tempV++;
        }
        
        if (tempV > maxV) maxV = tempV;
        
        for (i=0, j=k; j<s.length(); j++, i++) {
            if (isVowel(s.charAt(j)))
                tempV++;
            if (isVowel(s.charAt(i)))
                tempV--;
            if (tempV > maxV) maxV = tempV;
        }
        
        return maxV;
    }
    
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}