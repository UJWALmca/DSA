public class Reverse {
    public static String rev_string(String str){
        char[] chararray = str.toCharArray();

       int left=0;
        int right= chararray.length-1;

        while(left<right){
            char temp = chararray[right];
            chararray[right]= chararray[left];
            chararray[left]=temp;
            left++;
            right--;
        }
return new String(chararray);

    }

    public static void main(String args[]){
        System.out.println(rev_string("hello"));
    }
    
}
