class Solution {
    public int finalValueAfterOperations(String[] operations) {
         int k=0;
         
        for(int i =0;i<operations.length;i++){
            if((operations[i].equals("--X")) || (operations[i].equals("X--"))){
                k=k-1;
                
            }
            else{
                k=k+1;
            }
        }
        return k;
    }
}
