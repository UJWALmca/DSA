public class pallindrome {
    public static void main(String[] args) {
        String s = "sawjal";
int k = s.length()/2;
int j =s.length();
int q=0;
        for(int i =0;i<k;i++){
            if(s.charAt(i)==s.charAt(j-1)){
                q++;
                j--;
                if(q==k){
                    System.out.println("its palindrome");
                }
                
            }
            else{
                System.out.println("not palindrome");
                break;
            }
            
            
        }
    }
    
}
