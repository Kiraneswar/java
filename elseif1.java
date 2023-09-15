import java.util.*;

public class elseif1 {
    public static void main (String[]args){
        try (Scanner sc = new Scanner(System.in)){
           System.out.println("enter any number ");
           int button =sc.nextInt();
           
           if(button==1){
            System.out.println("hello");
           }
           else if(button==2) {
            
            System.out.println("namaste");
           }
           else if (button==3){
            System.out.println("bonjour");
           }
           else{
            System.out.println("invalid button");
           }
        }

        }
    }
    
