import java.util.Scanner;

class reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            
        
        System.out.println("enter your three digit number");
        int c = sc.nextInt();
       
        int s = c/100, k = c%10,b,j;

        if(s>k){
             j =s-k;
            

             b =c-(9*(j*11)); 
             System.out.println(b);          
        }
        else if(k>s){
            j =k-s;
            

             b =c+(9*(j*11)); 
             System.out.println(b); 
        
        }
        else{
            System.out.println(c);
        }   
    }
}
    

}