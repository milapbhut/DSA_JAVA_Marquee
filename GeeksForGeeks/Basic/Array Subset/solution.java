class Solution {
    public boolean isSubset(int a[], int b[]) {

        if (a.length < b.length) {
            return false;
        }
        
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < b.length; i++) {
            boolean flag = false;

            for (int j = i; j < a.length; j++) {
                if (b[i] == a[j]) {
                    flag = true;
                    // a[j] = -1;
                    break;
                }
            }

            if (!flag) {
                return false;
            }
        }

        return true;
    }
}