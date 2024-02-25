import java.util.*;

public class Check_fact {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("select1 to check factorial and 0 to exit");
        int q = sc.nextInt();
        while(q==1){
        System.out.println("enter the integer");
        int s = sc.nextInt();
        if (s<0) {
            System.out.println("invalid input");
            
        }
        else if (s==0) {
            System.out.println("1");
            break;
            
        }
        else{
            for(int i =s;i>0;i--){
                 fact = fact*i;
                 //System.out.println(i);
            }
            System.out.println(fact);
            fact=1;
        }
    }
        
    }
}
