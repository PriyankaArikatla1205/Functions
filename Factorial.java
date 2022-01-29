import java.util.*;
public class Factorial {
    public static int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
        public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int k= input.nextInt();
        System.out.println(fact(k));
    }
}
