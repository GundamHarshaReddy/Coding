class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int mid = n/2;
        int p1=0;
        int p2=n-1;
        for(int i=0;i<mid;i++){
            char ch = s[p1];
            s[p1] = s[p2];
            s[p2] = ch;
            p1++;
            p2--;
        }
    }
}