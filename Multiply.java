import java.util.*;
public class Multiply{
    public static int multiply(int a, int b) {
        return a*b;
    }
 public static void main(String[]args){
     Scanner input = new Scanner (System.in);
 int r=input.nextInt();
 int k=input.nextInt();
   System.out.println(multiply(r,k));
 }
}