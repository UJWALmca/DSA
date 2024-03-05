public class Array_sum {
    public static void main(String[] args) {
        int[] s ={1,2,3,4,5};
        int sum=0;

        for(int i=0;i<s.length;i++){
            sum=sum+s[i];
        }
        System.out.println("sum of array "+sum);
    }
}
