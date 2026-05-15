class Solution {
    public int trap(int[] arr) {
        int n = arr.length;

        int left = 0;
        int right = n-1;

        int leftmax = arr[left];
        int rightmax = arr[right];

        int count = 0;

        while(left<right){
            if(arr[left]<=arr[right]){
                left++;
                leftmax = Math.max(leftmax,arr[left]);
                count += leftmax - arr[left];
            }else{
                right--;
                rightmax = Math.max(rightmax,arr[right]);
                count += rightmax - arr[right];
            }
        }
        return count;
    }
}
