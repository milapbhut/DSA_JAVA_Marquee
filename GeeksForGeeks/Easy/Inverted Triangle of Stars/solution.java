import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // code here
        for (int i = 1;i <= n ; i++ ){
            for(int a = 1; a < i; a++){
              System.out.print(" ");
            }
            for(int j = n; j >= i ; j--){
              System.out.print("*");
            }
            for(int k = n; k > i ; k--){
                System.out.print("*");
            }
        System.out.println();
      }
    }
}