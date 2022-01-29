import java.util.*;
public class Sumandproduct {
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void multiply(int a, int b){
        System.out.println(a*b);
    }
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        int k = input.nextInt();
        int t = input.nextInt();
        sum(k,t);
        multiply(k,t);

    }
}
