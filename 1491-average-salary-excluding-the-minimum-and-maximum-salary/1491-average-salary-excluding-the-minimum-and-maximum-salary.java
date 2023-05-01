class Solution {
    public double average(int[] salary) {
        if (salary.length == 2) return 0;
        
        int maxs = Integer.MIN_VALUE;
        int mins = Integer.MAX_VALUE;
        
        double sum  = 0;
        
        for (int x: salary) {
            mins = Math.min(mins, x);
            maxs = Math.max(maxs, x);
            
            sum += (double) x;
        }
        
        return (sum - (mins+maxs)) / (salary.length - 2);
    }
}

/*
C++:
double average(vector<int>& salary) {
    if(salary.size()==2) return 0;
    int mins = INT_MAX;
    int maxs = INT_MIN;
    double sum = 0;
    for(int x: salary){
        mins = min(mins,x);
        maxs = max(maxs,x);
        sum+=(double)x;
    }
    return (sum - (mins+maxs)) / (salary.size()-2);
}

*/