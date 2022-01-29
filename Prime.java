import java.util.*;

public class Prime {
    public static void prime(int k) {
      int flag =0;
        if(k==0||k==1){
            System.out.println("Given number is not a prime number");
        }
        else{
        for(int i=2; i<k ;i++){
            if(k%i==0){
                System.out.println("given number is not a prime number");
                flag=1;
                break;
            }
            }
        }
        if(flag ==0 ){
            
                System.out.println("Given number is prime");
        }
        
        
    }
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int r =input.nextInt();
        prime(r);
    }
}
