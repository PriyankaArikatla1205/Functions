import java.util.*;
public class Even {
    public static void even(int k) {
        if(k%2==0){
           System.out.println("Even Number");
        }
        else{
         System.out.println("Odd Number");
        }
        
    }
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int t =input.nextInt();
        even(t);
    }
    
}
