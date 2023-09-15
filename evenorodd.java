import java.util.*;

public class evenorodd {
    public static void main (String[]args){
        try (Scanner sc = new Scanner(System.in)){
           System.out.println("enter a number");
           int x =sc.nextInt();

           if(x%2==0){
            System.out.println("even number");
           }
           else{
            System.out.println("odd number");
           }

           
           
        }
    }
    
}
