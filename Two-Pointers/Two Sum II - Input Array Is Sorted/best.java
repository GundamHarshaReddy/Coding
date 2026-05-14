class Solution {
    public int[] twoSum(int[] arr, int k) {
        int p1=0;
        int p2=arr.length-1;
        while(p1<p2){
            if(arr[p1]+arr[p2]==k){
                return new int[]{p1+1,p2+1};
            }else if(arr[p1]+arr[p2]<k){
                p1++;
            }else if(arr[p1]+arr[p2]>k){
                p2--;
            }
        }
        return new int[0];
    }
}