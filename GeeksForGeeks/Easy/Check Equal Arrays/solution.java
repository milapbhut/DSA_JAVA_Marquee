class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        // int count = 0;
        if(a.length != b.length){
            return false;
        }
        for(int i = 0; i < a.length ; i++){
            if(a[i] != b[i]){
                // count ++;
                return false;
            }
        }
        return true;
    }
}