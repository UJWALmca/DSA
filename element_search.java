import java.util.*;

public class element_search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        while(true){
        System.out.println("enter the element to find");
        int s = sc.nextInt();

        for(int i =0;i<10;){
            if(s==arr[i]){
                System.out.println("element found "+arr[i]);
                break;
            }
            else if(i==9){
                System.out.println("element not found");
                

            }
            else{
                i++;
            }
           
        }
    }
}
}
