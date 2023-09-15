import java.util.*;

public class age {
    public static void main (String[]args){
        try (Scanner sc = new Scanner(System.in)){
           System.out.println("enter your age");
           int age =sc.nextInt();

           if(age>=18){
            System.out.println("adult");
           }
           else{
            System.out.println("not an adult");
           }
           
        }
    }
    
}
