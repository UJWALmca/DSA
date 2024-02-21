public class array_sort {

public static void main(String[] args) {
    int[] s = {2,3,4,1,5,7,6};

    for(int i=1;i<s.length;i++){
        for(int j=0;j<s.length-1;j++){
            if(s[j]>s[i]){
                int temp = s[j];
                s[j]=s[i];
                s[i]=temp;
            }

        }
    }
    for(int i =0;i<s.length;i++){
    System.out.println(s[i]);
    }
}
    
}
