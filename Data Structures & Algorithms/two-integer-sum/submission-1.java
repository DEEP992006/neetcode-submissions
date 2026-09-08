class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
          for(int i = 0; i < nums.length; i++){
            int rem =target- nums[i];
            if(map.get(rem) != null && map.get(rem) != i){
                return new int[]{i,map.get(rem)};
            }
        }
        return new int[]{0,0};
    }
}
