class Solution {
    fun average(salary: IntArray): Double {
        if (salary.size == 2) return 0.0
        
        var maxs = Int.MIN_VALUE
        var mins = Int.MAX_VALUE
        var sum: Double = 0.0
        
        for (x in salary) {
            maxs = kotlin.math.max(maxs, x)
            mins = kotlin.math.min(mins, x)
            sum += x.toDouble();
        }
        
        return (sum - (maxs+mins)) / (salary.size - 2);
    }
}

/*
JAVA:
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

*/