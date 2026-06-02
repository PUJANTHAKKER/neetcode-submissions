class Solution {
    public boolean hasDuplicate(int[] nums) {
       return Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toSet())
        .size() < nums.length;
    }
}