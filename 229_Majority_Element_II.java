class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        
        int count1 = 0;
        int count2 = 0;
        Integer target1 = null;
        Integer target2 = null;
        for(int i: nums){
            if(target1 != null && target1 == i)
                count1++;
            else if(target2 != null && target2 == i)
                count2++;
            else if(count1 == 0){
                target1 = i;
                count1 = 1;
            }
            else if(count2 == 0){
                target2 = i;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i: nums){
            if(target1 != null && i == target1)
                count1++;
            else if(target2 != null && i == target2)
                count2++;
        }
        if(count1 > nums.length/3) res.add(target1);
        if(count2 > nums.length/3) res.add(target2);
        return res;
    }
}
