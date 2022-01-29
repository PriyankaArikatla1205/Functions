
import java.util.*;
public class Table {
    public static void table(int k) {
        for(int i=1; i<=10; i++){
             System.out.println(k +"*" +i +"=" +k*i);
        }
    }
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        table(r);
        
    }
    
}
