class Solution {
    public int totalMoney(int n) {
        int w = n / 7;
        int d = n % 7;
        int m = 1;
        int total = 0;
        if(w != 0){
            for(int i = 0; i < w; i++){
                int sum = 0;
                int p = m;
                for(int j = 0; j < 7; j++){
                    sum = sum + p;
                    p++;
                }
                total = total + sum;
                m++;
            }
        }
        int demo = 0;
        int day = 0;
        for(int k = 0; k < d;k++){
            demo = demo + m + day;
            day++;
        }
        total = total + demo;
        return total;
    }
}