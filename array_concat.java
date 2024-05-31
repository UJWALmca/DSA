class Solution {
    public int[] samp(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i =0;i<nums.length*2;i++){
            if(i>nums.length-1){
                ans[i] = nums[i - nums.length];
            }
            else{
            ans[i] = nums[i];
            }
        }
        return ans;
    }
}
