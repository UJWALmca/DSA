import java.util.*;
public class swapping_inplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter 2 values");
        System.out.println("value 1");
        int a = sc.nextInt();
        System.out.println("enter 2 value");
        int b = sc.nextInt();
        b = a+b;
        a = b-a;
        b = b-a;
        System.out.println("a= "+a+"b="+b);
        

    }
    
}
