class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        // int k=0;
        for(int i=0 ; i<nums1.length ; i++){
            for(int j=0 ; j<nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    result.add(nums1[i]);
                    nums2[j] = Integer.MIN_VALUE;
                    break;   
                }
            }
        }
        int[] nums3 = new int[result.size()];
        for(int k=0 ; k<nums3.length ; k++){
            nums3[k] = result.get(k);
        }
        return nums3;
    }
}