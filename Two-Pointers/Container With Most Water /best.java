//solved in one go
class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int p1 = 0;
        int p2 = n-1;

        int maxarea = Integer.MIN_VALUE;

        while(p1<p2){
            int min = Math.min(arr[p1],arr[p2]);
            int len = p2-p1;
            int area = len*min;
            maxarea = Math.max(maxarea,area);
            if(arr[p2]<=arr[p1]){
                p2--;
            }else{
                p1++;
            }
        }
        return maxarea;
    }
}
