import java.util.*;

public class remove_occurance {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String s = sc.next();
        char[] c = s.toCharArray();
        System.out.println("enter the char to remove");
        char g = sc.next().charAt(0);
        for(int i =0;i<c.length;i++){
            if(c[i]==g){
                for(int k =i;k<c.length-1;k++){
                c[k]=c[k+1];
            }
        }}
        for(int i=0;i<c.length;i++){
        System.out.print(" "+c[i]);
        }
        sc.close();

     }    
}
