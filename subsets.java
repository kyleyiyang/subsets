class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lst= new ArrayList<>();
        backtrack(lst,new ArrayList<Integer>(),nums,0);
        return lst;
    }
    public void backtrack(List<List<Integer>> lst, List<Integer> temp, int[] nums, int start) {
        lst.add(new ArrayList<Integer>(temp));
        for (int i=start;i<nums.length;i++) {
            //if (temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backtrack(lst,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
