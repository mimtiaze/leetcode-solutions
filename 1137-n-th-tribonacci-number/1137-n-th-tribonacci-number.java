class Solution {
    public int tribonacci(int n) {
        if (n < 2) return n;

        int Tn, Tn1, Tn2, Tn3;
        Tn = 0; Tn1 = 1; Tn2 = 1;
        for (int i = n; i > 2; i--) {
            Tn3 = Tn + Tn1 + Tn2;
            
            Tn = Tn1;
            Tn1 = Tn2;
            Tn2 = Tn3;
        }
        
        return Tn2;
    }
}