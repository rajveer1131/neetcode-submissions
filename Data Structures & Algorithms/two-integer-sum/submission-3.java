class Solution {
    public int[] twoSum(int[] nums, int target) {


    //  int i=0;
    //  int j=0;


        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{0,0};


        Map<Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(mp.containsKey(diff)){
                int a=Math.min(mp.get(diff),i);
                int b=Math.max(mp.get(diff),i);
                System.out.print("ddd");
                return new int[]{a,b};
            }
            mp.put(nums[i],i);
        }
        return new int[]{0,0};

    }
}
