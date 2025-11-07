class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            if (myMap.containsKey(need)) {
                return new int[]{myMap.get(need), i};
            }
            myMap.put(nums[i], i);
        }
        return new int[]{};
        
    }
    
}
