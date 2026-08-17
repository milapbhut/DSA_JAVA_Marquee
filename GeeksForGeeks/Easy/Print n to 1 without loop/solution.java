class Solution {
    void printNos(int n) {
        // code here
        if(n >= 1){
            System.out.print(n + " ");
            n--;
            printNos(n);
        }
    }
}