class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i: nums) xor ^= i;
        
        int diff = xor & -xor;
        // System.out.println(-xor);
        int xor2 = 0;
        
        for(int i: nums) if((diff & i) == diff) xor2 ^= i;
        // System.out.println(xor2);
        return new int[]{xor2, xor^xor2};
    }
}
