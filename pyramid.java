import java.util.*;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number  of rows");
        int r = sc.nextInt();
        for(int i = 0;i<r;i++){
            for(int j =0;j < r - i - 1;j++){
                System.out.print(" ");
            }
            for(int k =0;k<=i;k++){
                System.out.print("s ");
            }
            System.out.println();

        }
    }
    
}
