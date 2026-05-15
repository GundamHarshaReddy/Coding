class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        HashSet<List<Integer>> hs = new HashSet<>();
        for(int i=0;i<n-2;i++){

            //skip duplicates like [-1,-1 or 1,1,1]
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int p2=i+1;
            int p3=n-1;
            while(p2<p3){
                int ans = nums[i]+nums[p2]+nums[p3];
                if(ans==0){
                    hs.add(Arrays.asList(nums[i],nums[p2],nums[p3]));
                    //after adding in set if you dont increment then it will run infinite
                    p2++;
                    p3--;

                    //you also need to check duplicates inside with pointers right?
                    while(p2<p3 && nums[p2]==nums[p2-1]){
                        p2++;
                    }
                    while(p2<p3 && nums[p3]==nums[p3+1]){
                        p3--;
                    }
                }else if(ans<0){
                    p2++;
                }else{
                    p3--;
                }
            }
        }
        return new ArrayList<>(hs);
    }
}
